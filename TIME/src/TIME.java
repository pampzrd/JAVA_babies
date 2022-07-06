
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TIME {
    public static void main(String[] args) {}
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}



/*fUNCIONOU MAS NÃO EDITA O FORMATO
import java.util.Date;

public class TIME{
    public static void main(String[] args){
        Date data = new Date();
        System.out.println(data);
    }


}*/

