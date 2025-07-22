package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        getContentPane().setBackground(Color.WHITE);        
        
        setSize(800, 480); // Length & breadth of frame
        setVisible(true); // Now we can see the frame
        setLocation(350, 200); // From where to open frame , 350 & 200 from left & right
    }
    
    public static void main(String args[]){
        new Login(); // Open the login frame as soon as we start the application
    }    
}
