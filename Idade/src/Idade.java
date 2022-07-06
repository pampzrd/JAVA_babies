import java.util.Scanner;


public class Idade {

    public static void main(String[] args) {
        System.out.println("Digite a dezena da sua idade... ");
        Scanner sc1 = new Scanner(System.in);
        //< > usando switch case?
        //Como usar o Scanner e armazenar na variável
        int idade = sc1.nextInt();  // VarScan.nextInt() Transforma o dado do Scanner em Inteiro.

        switch(idade)
        {
            case 10:
                System.out.println("Princesinha da mamãe\n"+"Gatos: 0");
                break;
            case 20:
                System.out.println("Rainha do baile\n"+"Gatos: 1");
                break;
            case 30:
                System.out.println("Tia\n"+"Gatos: 5");
                break;
            default:
                System.out.println("Senhora?\n"+"Gatos: 25 e contando...");
                // Em default não se usa break pq é a ultima condição.
                /*  Forma melhor do SWITCH CASE
                switch (idade) {

                    case 10 -> System.out.println("Princesinha da mamãe\n" + "Gatos: 0");
                    case 20 -> System.out.println("Rainha do baile\n" + "Gatos: 1");
                    case 30 -> System.out.println("Tia\n" + "Gatos: 5");
                    default -> System.out.println("Senhora?\n" + "Gatos: 25 e contando...");*/

                }
    }
}
