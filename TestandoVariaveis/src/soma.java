public class soma {
    public static void main(String[] args)
    {
        final int A = 10;
        //final é const Variável Final no Java costuma ser criada usando MAIUSCULAS_E_UNDERLINE
        int b = 11;
        b =24;
        System.out.println(A+b);
        int i;
        //int i; não devem ter o mesmo nome
        int I;
   //     int 1a; //XX PROIBIDO começar com números
        int _1a; //Não recomendado "_" (exceto nas final)
        int $aq; //xx Não recomendado "$"
        int a829ffj; //letras e numeros OK
        //int a829 gg; //sem espaços
        int a29j_$cbf;
        //int jkj5%fjl; //sem % () {} [] Proibidos
        int quantidadeProduto = 10; //Notação camelo
        int QuantidadeProduto =10; //Não é bom começar com maiúscula
        final int NUMERO_TENTATIVAS=5; // Padrão de variável final com MAIUSCULAS E "_"
        final int numeroTentativas= 5; //Notação camelo na variável final não é legal
        int QUANTIDADE_PRODUTOS = 10; //Não é bom todas maiúsculas
        int qtdProd; //Nome não é claro

        //Exercício: Duas variáveis por tipo
        byte a = -50;
        byte b1 = 100;
        short c = -30000;
        short d = 18000;
        int e = -2000000000;
        int f = 190000300;
        long g = -9223372036854775808L; //Se não adicionar o L ele entende que a long é uma Int
        long h = 800902909309209L;
        float j = 3.78989f;
        float k = -2.8980f;
        double l = -18.98989090908978789877998d;
        double m = 9302787482378477392874993d;
        char n = 'p';
        char o = '9';
        String p = "Pam";
        String q = "Rod"; //String maiusculo = variável & Minusculo = Objeto
        System.out.println(p+" "+q);
        boolean b2 = true;
        boolean b3 = false;







    }
}
