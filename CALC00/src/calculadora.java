import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Cria as variáveis
        int a,b;
        System.out.println("Digite o primeiro valor:  ");
        a = scan.nextByte();
        System.out.println("Digite o segundo valor:  ");
        b = scan.nextByte();
        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("Soma:  " + somar);
        System.out.println("Subtração:  " + subtrair);
        System.out.println("Multiplicação:  " + multiplicar);
        System.out.println("Divisão:  " + dividir);

    }

    public static int somar(int a,int b)
    {
        return a + b;
    }

    public static int subtrair(int a,int b)
    {
        return a - b;
    }

    public static int multiplicar(int a,int b)
    {
        return a * b;
    }

    public static float dividir(float a,float b)
    {
        return a / b;
    }

}
