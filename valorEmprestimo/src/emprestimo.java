import pacote.Lol;
import pacote.operacoes;

import java.security.Principal;
import java.util.Scanner;

public class emprestimo {

    public static void main(String[] args) {
        /*
        * NOVO MÉTODO DENTRO DE MAIN
        * Cria uma instancia para colocar o método
        * Cria uma classe diferente(dentro do pacote) e coloca o método lá
        * aí chama o método pela variavel atribuída á classe
        * classe Variável = new classe();
         */

        float ju,mon,cp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu investimento:    \n");
        cp = sc.nextFloat();
        System.out.println("Você investiu:    \n"+cp);


        /* op.juros();
        op.capital();
        op.montante();

        Usado para aprender a chamar métodos dentro da mesma classe *****

        emprestimo emp = new emprestimo();
        Lol lol = new Lol();
        lol.coisa();

        emp.budega();
        emp.picapau();
        /* essa variável será criada apenas 1x e depois usada para chamar métodos dessa classe específica */

    }
      /***    CRIANDO MÉTODOS FORA DO MÉTODO MAIN    ***/



   /*  TESTANDO MÉTODOS RANDOM
    public void budega(){
        int i = 10;
        int a=i+15;
        System.out.println("E a budega é ... "+a);

    }

    public void picapau()
    {
        System.out.println("“Obrigado amigo, você é um amigo.” – Jubileu.");
    }

*/






}