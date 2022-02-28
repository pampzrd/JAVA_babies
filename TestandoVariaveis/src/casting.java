public class casting {
    public static void main(String[] args) {
        int a = 100;
        float b;
        b = (float)a;
        double c = 3098785490394094308489384839984d;
        int d = (int)c;//teve perda de dados para o máximo da capacidade do inteiro
        float f3 = 0.5f;
        double d3 = f3; //foi promovido para double, logo não precisa de declaração.

        System.out.println(b);
        System.out.println(d);
    }
}
