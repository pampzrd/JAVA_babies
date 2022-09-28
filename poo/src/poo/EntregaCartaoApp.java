package poo;

import poo.model.Cliente;
import poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "000000";
        //dados do endereço
        Cliente cliente = new Cliente();
        //dados do cliente

        try {
            cliente.adicionaEndereco(endereco);  //.add pq é uma função da lista (que vai adicionar o novo valor de endereço na lista).
            //associar o endereço ao cliente por meio da associação de classes
            //Encapsulamento usando setter
            System.out.println("Endereço adicionado com sucesso");
        } catch (Exception e) {
        System.err.println("Houve um erro ao adicionar endereço: "+ e.getMessage()); //Informa o erro de forma clara. Tratamento de erros no Java (try catch).


    }



    }
}
