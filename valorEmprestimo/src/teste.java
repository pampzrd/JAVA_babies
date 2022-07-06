import java.util.Scanner;

public class teste {

        public static void main(String[] args) {
            /*
             * NOVO MÉTODO DENTRO DE MAIN
             * Cria uma instancia para colocar o método
             * Cria uma classe diferente(dentro do pacote) e coloca o método lá
             * aí chama o método pela variavel atribuída á classe
             * classe Variável = new classe();
             */

            float q;
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira seu investimento:    \n");
            q = sc.nextFloat();
            System.out.println("Você investiu:    \n" + q);


        }
    }