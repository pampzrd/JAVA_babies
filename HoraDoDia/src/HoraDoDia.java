import java.util.Scanner;

public class HoraDoDia {
    public static void main(String[]args) {

        System.out.println("Nesse momento é...\n1.Manhã 2.Tarde 3.Noite");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int verd;

        do {
            if (choice > 3) {
                System.out.println("Por favor, escolha entre 1 e 3.");
                sc = new Scanner(System.in);
                choice = sc.nextInt();
                verd = 0;
            }

        if (choice <= 0) {
            System.out.println("Por favor, escolha entre 1 e 3.");
            sc = new Scanner(System.in);
            choice = sc.nextInt();
            verd = 0;
        } else {
            verd = 1;
        }
    }while(verd == 0);

if(verd == 1) {
    //Para perguntar enquanto não tiver cumprido a escolha
       /* do{
            System.out.println("Por favor, escolha entre 1 e 3.");
            sc = new Scanner(System.in);
            choice = sc.nextInt();
        }while(choice!=1);//(choice!=2);(choice!=3);*/
    switch (choice) {
        case 1 -> System.out.println("Bom dia!");
        case 2 -> System.out.println("Boa tarde!");
        case 3 -> System.out.println("Boa noite!");
    }
}else{
    verd = 0;
}
    }
}

