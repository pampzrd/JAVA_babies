import javax.swing.*;
//Exemplo de código com swing SEM o FORM

public class FirstSwingExample {
    public static void main(String[] args) {

        JFrame f = new JFrame();//Criando uma instância do JFrame

        JButton b = new JButton("Florzinha");//Criando uma instância do JButton
        b.setBounds(30,20,100, 40);//x, y, largura, altura

        f.add(b);//Adicionando um botão no JFrame

        f.setSize(200,100);//400px de largura 500px de altura
        f.setLayout(null);//não usando layout
        f.setVisible(true);//tornando o frame visível
    }
}




