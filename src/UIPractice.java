import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class UIPractice {

        public static void main(String[] args) {
           JFrame f = new JFrame("User Form");
           f.setVisible(true);
           f.setSize(400, 400);
           f.setLayout(new FlowLayout());
           f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

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

        }
}





