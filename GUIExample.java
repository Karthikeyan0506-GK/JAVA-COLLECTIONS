import javax.swing.*;

public class GUIExample{
    public static void main(String[] args) {
        JFrame WELCOME=new JFrame();

        JButton B1=new JButton("WELCOME");
        B1.setBounds(250,150,100,50);
        WELCOME.add(B1);
        WELCOME.setSize(300,300);
        WELCOME.setLayout(null);
        WELCOME.setVisible(true);
    }
}
