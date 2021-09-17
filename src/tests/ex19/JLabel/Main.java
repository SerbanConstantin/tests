package tests.ex19.JLabel;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("html.png");
        Border border = BorderFactory.createLineBorder(Color.green);

        JLabel label = new JLabel(); // create a label
        label.setText("What is HTML?");  // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);  // set text LEFT, CENTER, RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageIcon
        label.setForeground(new Color(100, 100, 200));  // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 30)); // set font of text
        label.setIconTextGap(25);  // set gap of text to image
        label.setBackground(Color.black);  // set background color
        label.setOpaque(true);  // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);  // set horizontal position of icon+text within label
        //label.setBounds(100, 100, 350, 350);  //set x, y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}
