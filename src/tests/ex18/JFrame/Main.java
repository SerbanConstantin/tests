package tests.ex18.JFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JFrame = a GUI window to add components to

//        JFrame jFrame = new JFrame();                           // crates a frame
//        jFrame.setTitle("JFrame title goes here");              //sets title of frame
//        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);  // exit out of application
//        jFrame.setResizable(false);                             // prevent frame from being resized
//        jFrame.setSize(420, 420);                 // sets the x- dimension and y-dimension of frame
//        jFrame.setVisible(true);                                // make frame visible
//
//        ImageIcon image = new ImageIcon("382.jpg");   // create an image Icon
//        jFrame.setIconImage(image.getImage());                  // change icon on frame
//        jFrame.getContentPane().setBackground(new Color(123,50,250));     // change color of background

        MyFrame myFrame = new MyFrame();

    }
}
