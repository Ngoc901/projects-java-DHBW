package SwingPractice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Timer extends JFrame {
    public JLabel timerlabel;



    public Timer() {
        setTitle("Card Flipping Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Timer Label

        timerlabel = new JLabel("Time: 0 sec", SwingConstants.CENTER);
        timerlabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(timerlabel, BorderLayout.NORTH);

        // Start Button
        JButton startButton = new JButton("Start Game");
        add(startButton, BorderLayout.SOUTH);

        startButton.addActionListener(e -> startTimer());

        setVisible(true);

    }

    private void startTimer() {
        Timer timer;
         int timeElapsed = 0;

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeElapsed++;
                timerlabel.setText("Time: " + timeElapsed + " sec");
            }
        });



        if (timer != null && timer.isRunning()) {
            timer.stop(); // Reset timer if it's running
            timeElapsed[0] = 0;
            timerlabel.setText("Time: 0 sec");
        }



        timer.start();
    }



}



