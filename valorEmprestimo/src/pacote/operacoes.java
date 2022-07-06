package pacote;

public class operacoes {
/* JUROS COMPOSTOS
* MONTANTE = CAPITAL APLICADO * (1+TAXA DE JUROS COMPOSTOS)^Parcelas
* MONTANTE = CAPITAL + JUROS COMPOSTOS
* JUROS COMP = MONTANTE - CAPITAL
* */
    public void montante()
    {
        float mon,cap,ju;
        cap = 9;
        ju = 1;
        mon = cap + ju;
        System.out.println("O valor do montante é   "+mon);
    }
    public void juros()
    {
        float mon,cap,ju;
        cap = 9;
        mon = 1000;
        ju = mon - cap;
        System.out.println("O valor do juros é   "+ju);
    }

    public void capital()
    {
        float mon,cap,ju;
        mon = 1009;
        ju = 1;
        cap = mon - ju;
        System.out.println("O valor do capital investido é   "+cap);
    }



}
