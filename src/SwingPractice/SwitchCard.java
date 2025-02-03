package SwingPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchCard {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Switch Card");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setSize(800, 400);

        // Create the button with an initial image
        JButton btnNewButton = new JButton(new ImageIcon("assets/images/back.jpg"));
        btnNewButton.setBorder(BorderFactory.createEmptyBorder());
        btnNewButton.setContentAreaFilled(false);
        btnNewButton.setFocusable(false);
        btnNewButton.setActionCommand("1"); // Set action command for switch case
        frame.add(btnNewButton);

        // Add ActionListener
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ("1".equals(e.getActionCommand())) {
                    // Change icon with a delay using Swing Timer
                    btnNewButton.setIcon(new ImageIcon("assets/images/back.jpg"));

                    new Timer(1, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            btnNewButton.setIcon(new ImageIcon("assets/images/darkness.jpg"));
                        }
                    }).start();
                }
            }
        });

        frame.setVisible(true);
    }
}
