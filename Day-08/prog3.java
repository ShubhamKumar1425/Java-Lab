import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog3 extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private long startTime;
    private boolean isRunning;

    public prog3() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        timeLabel = new JLabel("00:00:00.000", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        // Add action listeners
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stop();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        // Layout components
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(timeLabel, BorderLayout.CENTER);
        container.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void start() {
        if (!isRunning) {
            isRunning = true;
            startTime = System.currentTimeMillis();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (isRunning) {
                        long elapsedTime = System.currentTimeMillis() - startTime;
                        updateTime(elapsedTime);
                        try {
                            Thread.sleep(10); // Update time every 10 milliseconds
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            thread.start();
        }
    }

    private void stop() {
        isRunning = false;
    }

    private void reset() {
        stop();
        updateTime(0);
    }

    private void updateTime(long elapsedTime) {
        long hours = elapsedTime / 3600000;
        long remainder = elapsedTime % 3600000;
        long minutes = remainder / 60000;
        remainder %= 60000;
        long seconds = remainder / 1000;
        long milliseconds = remainder % 1000;

        String time = String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex3().setVisible(true);
            }
        });
    }
}
