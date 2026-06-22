import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {

    JLabel messageLabel;
    JRadioButton redButton, yellowButton, greenButton;

    public TrafficLight() {
        setTitle("Traffic Light Simulator");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label (Initially blank)
        messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Radio Buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Group radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Add action listeners
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Add components
        add(messageLabel);
        add(redButton);
        add(yellowButton);
        add(greenButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (redButton.isSelected()) {
            messageLabel.setText("STOP");
            messageLabel.setForeground(Color.RED);
        }
        else if (yellowButton.isSelected()) {
            messageLabel.setText("READY");
            messageLabel.setForeground(Color.ORANGE);
        }
        else if (greenButton.isSelected()) {
            messageLabel.setText("GO");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}