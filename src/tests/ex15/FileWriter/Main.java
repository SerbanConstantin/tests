package tests.ex15.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\n ");
            writer.append("\n(A poem by me)");
            writer.close();

            FileWriter writer1 = new FileWriter("electricCars.txt");
            writer1.write("Constr: Tesla, Kia, Porsche, Jaguar");
            writer1.append("\nModels: Model 3, E-Niro, Tycan, I-Pace");
            writer1.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
