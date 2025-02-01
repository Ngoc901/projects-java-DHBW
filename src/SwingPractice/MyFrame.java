package SwingPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame() {

        ImageIcon icon = new ImageIcon("assets/images/back.jpg");

        button = new JButton();
        button.addActionListener(e -> System.out.println(":3"));
        button.setIcon(icon);

        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button = new JButton("Click Me"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println(":3");
        }

    }
}
