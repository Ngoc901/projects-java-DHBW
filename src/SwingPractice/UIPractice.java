package SwingPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UIPractice {

        public static void main(String[] args) {

           JFrame f = new MyFrame();
           f.setTitle("User Form");
           ImageIcon image = new ImageIcon("assets/images/back.jpg");
           f.setIconImage((image.getImage()));
           f.getContentPane().setBackground(Color.white);

           JLabel l1 = new JLabel("Username:");
           f.add(l1);
           JTextField tf_name = new JTextField(20);
           f.add(tf_name);
           JLabel l2 = new JLabel("Password:");
           f.add(l2);
           JTextField tf_pwd = new JTextField(20);
           f.add(tf_pwd);

           JButton b = new JButton("Submit");
           f.add(b);






           f.pack(); // resize according to components

        }
}





