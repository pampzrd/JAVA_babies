import org.w3c.dom.ls.LSOutput;

public class operadoresEx {
    public static void main(String[] args) {
        //Exercício: Crie variáveis e use os operadores para alterar o resultado
        int a = 1;
        a++; //a passa a ser 2
        int b = 2;
        b++; //b passa a ser 3
        int c = 10;
        c = ++a; // c passa a ser 2+1 = 3
        int d = ++a; //continua somando o valor de a
        //int d = a++; não soma o valor de a no Intellij
        //O a a partir daqui assume o mesmo valor que o c, 3.

        d--;
        d*=2;
        d/=2;
        d%= 2;

        int z = 10;
        int y = z++ + --z; //++z = 11 + --z = 9 soma por último.





//Prints
        System.out.println(a + "\n");
        System.out.println(b + "\n");
        System.out.println(c + "\n");
        System.out.println(d + "\n");
        System.out.println(y);



    }
}