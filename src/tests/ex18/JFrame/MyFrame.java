package tests.ex18.JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("this title goes here");              //sets title of this
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);  // exit out of application
        this.setResizable(false);                             // prevent this from being resized
        this.setSize(420, 420);                 // sets the x- dimension and y-dimension of this
        this.setVisible(true);                                // make this visible

        ImageIcon image = new ImageIcon("382.jpg");   // create an image Icon
        this.setIconImage(image.getImage());                  // change icon on this
        this.getContentPane().setBackground(new Color(123,50,250));     // change color of background

    }
}
