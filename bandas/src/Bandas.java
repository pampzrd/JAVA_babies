import java.util.Arrays;
import java.util.Random;


public class Bandas {
    public static void main(String[] args) {
        //Tipo [] Nome para fazer uma array = new tipo[qtd de elementos]
        String [] bandas;
        String [] bandas1;
        String [] musicas = new String[4];
        int [] teste;

        // {} Inicia os valores da array
        //nome da array = new String[]{,,,}
        bandas = new String[]{"Cold Driven", "Ashes from New", "Dead by April", "Emery","Paramore"};
        teste = new int []{1,2,3};
        musicas = new String[]{"Straight for Disaster","Decode","Memories","The Ponytails Parade","That's what you get"};

        //PRINTS
        //NomeDaArray[index] só mostra o elemento naquela posição do index indicada entre colchetes.
        System.out.println(bandas[3]);
        /*
        ### Método toString para printar a array toda.
        Dentro de println(Arrays.toString(NomeDaArray));

        System.out.println(Arrays.toString(bandas));
        System.out.println(Arrays.toString(musicas));
        */
         System.out.println(Arrays.toString(teste));
        /*
        ### Método de impressão STREAM().FOREACH() que toma a matriz como argumento
        Também imprime a array inteira.
        O método stream().forEach() imprime 1 item por linha (quebra)
        Pesquisar a estrutura desse método
        */
         Arrays.stream(musicas).forEach(System.out::println);

        /*
        ### Método Loop For
         */
       /*for(int i=0; i<bandas.length;i++)
        {
            System.out.println(bandas[i]);
        };*/
        /*Enhanced for SERVE P Q?
         for (String banda : bandas) {

            System.out.println(banda);
        };*/

        //Números RANDOM
        Random random = new Random();
        int [] array= new int[5]; //Gera 5 números.
        for(int i=0;i<array.length;i++) {
            array[i] = random.nextInt(50); // Gera números aleatórios com limite 50.
            System.out.println(array[i]); //Saída gerando 5 números.
        }

        //### Elementos random da array
        //Primeiro fazer um inteiro para tero contador do Math.random() * qtdDeIndex
        int r = (int) (Math.random() * 4);
        System.out.println(bandas[r]);

        bandas1 = new String[]{"Nightwish","Shaman","Angra"};
        System.out.println(Arrays.toString(bandas1));

        //Concatenar Duas Arrays em JAVA
        //Método addALL (precisa importar apache)
        /*String [] Duas = ArrayUtil.addALL(bandas,bandas1);
        System.out.println(Arrays.toString(Duas));*/

        //Método ArrayCopy()





    }
}
