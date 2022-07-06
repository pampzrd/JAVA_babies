import java.util.Scanner;

public class emprestimo {

    public static void main(String[] args) {
        Scanner valor;
        Scanner parcelas;
        float total;
        int v1;
        int v2;
        float taxa = 0.3f;
        boolean vf;

        System.out.println("Insira o valor do empréstimo:     ");

        /*
        *Tipo de Erro: o valor inserido acima de 127 dá "Exception in thread "main" java.util
        * .InputMismatchException Value out of range. Radix:10.
        * Razão do erro: converti o scan com .nextByte, logo ele estava lendo a capacidade de armazenamento do Byte.
        */

        valor = new Scanner(System.in);
        v1 = valor.nextInt();
        System.out.println("Parcelado em quantas vezes?     ");
        parcelas = new Scanner(System.in);
        v2 = parcelas.nextByte();

        do {
            if (v2 > 12) {

                System.out.println("Parcelado em quantas vezes?     ");
                parcelas = new Scanner(System.in);
                vf = false;
            }
            if (v2 < 1) {

                System.out.println("Parcelado em quantas vezes?     ");
                parcelas = new Scanner(System.in);
                vf = false;

            } else {
                vf = true;
            }
        }while (!vf) ;

        /*
        * Erro 2 : Após escrever as parcelas errado, ao invés de esperar inserir denovo, ele repete a pergunta interminavelmente. (if/else/do...while)
        */
            if (vf == true) {
                total = v1 * (v2 * taxa);
                System.out.println(total);
            }else{
                vf = false;
            }
        }
    }





