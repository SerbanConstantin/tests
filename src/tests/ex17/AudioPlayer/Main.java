package tests.ex17.AudioPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {


        Scanner scanner = new Scanner(System.in);
        File file = new File("C:/Users/Serban/Desktop/CursOnlineProiect1/One Time - Jeremy Black.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = play, S = stop, R = Reset, Q = quit ");
            System.out.println("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default:
                    System.out.println("not a valid response");
            }
        }
        System.out.println("Byeeeee!");




    }
}
