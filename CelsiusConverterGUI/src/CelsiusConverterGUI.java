import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame{
    //Ele importou automaticamente a classe do JPanel quando coloquei um nome no elemento JPanel do GUI form.
    private JPanel mainPanel;
    private JTextField CelsiusTextField;
    private JButton BotaoConverter;
    private JLabel FahrenheitLabel;
    private JLabel CelsiusLabel;
    //CLASSE DO OBJETO & NOME DO OBJETO.



    public CelsiusConverterGUI(String title) {
        //Esse bloco vai alterar o nome título do aplicativo
        super(title);  //super classe
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);  //Vai ter o conteudo principal do aplicativo
        this.pack();


        BotaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFah = (int) ((Double.parseDouble(CelsiusTextField.getText())) * 1.8 + 32);
                FahrenheitLabel.setText(tempFah + "Fahreinheit");
            }

        });




    }
    public static void main(String[] args) {
        //Altera as propriedades dos objetos após importá-los para dentro da classe MAIN.
        JFrame frame = new CelsiusConverterGUI("Meu conversor de Celsius");  //Cria uma classe dentro de main para importar o método do GUI.
        frame.setVisible(true);
        frame.setSize(200,500);

    }
}
