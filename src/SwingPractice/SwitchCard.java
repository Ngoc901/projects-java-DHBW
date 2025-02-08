package SwingPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchCard implements ActionListener {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Memory Game");
        JButton card1 = new JButton("1");
        JButton card2 = new JButton("2");
        JButton card3 = new JButton("3");
        JButton card4 = new JButton("4");
        JButton card5 = new JButton("5");
        JButton card6 = new JButton("6");




        JPanel panel = new JPanel();

        Font myFont = new Font("Ariel",Font.BOLD,30);


        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(2, 3, 10,10));
        panel.add(card1);
        panel.add(card2);
        panel.add(card3);
        panel.add(card4);
        panel.add(card5);
        panel.add(card6);





        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.add(panel, new GridBagConstraints());

        //frame.add(panel);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
