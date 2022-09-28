package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public Integer codigo;
    public String nome;
    public String cpf;
    //Cria uma classe separada para o endereço, pq o cliente pode precisar demais de um endereço e reutilizar o mesmo trecho é útil para não ficar duplicando as variáveis.
    //Associação de classes: chamando a Classe Endereços para dentro da Classe Cliente.
    //A Lista é um objeto complexo. E ele vem nulo por padrão. Se tentar adicionar endereço na lista nula, ela vai dar erro.
    private List<Endereco> enderecos; //Deixar em private esconde o endereço.
    public void adicionaEndereco(Endereco endereco)//Recebe o Endereço e chama de "endereco"
    {
        if(endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo"); //joga um erro pro usuário.
        }

        if(endereco.cep == null){
            throw new NullPointerException("Cep não pode ser nulo"); //joga um erro pro usuário.
        }

        getEnderecos().add(endereco);


    }
   /* //Encapsulamento Setter
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }*/
    //Encapsulamento Getter
    private List<Endereco> getEnderecos() {
        if (enderecos == null)
        {
            enderecos = new ArrayList<Endereco>();
        }

        return enderecos;
    }


}
