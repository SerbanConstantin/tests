package tests.ex20.JPanel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("C:/Users/Serban/Desktop/CursOnlineProiect1/1000_F_343489025_Byvnjdh1OwQWBRf0MMrgqXJn7bKcW1lY.jpg");

        JLabel label = new JLabel();
        label.setText("Hi!");
        label.setIcon(icon);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0,250,500,250);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

    }

}
