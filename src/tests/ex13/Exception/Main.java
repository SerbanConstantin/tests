package tests.ex13.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // exception = an event that occurs during the execution of a program that, disrupts the normal flow of instructions


    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("enter a hole number to divide");

            int x = scanner.nextInt();

            System.out.println("enter a hole number to divide by: ");

            int y = scanner.nextInt();

            System.out.println("result " + x / y);

        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero");

        }catch (InputMismatchException e){
            System.out.println("pls enter a number");
        }catch (Exception e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("this will always print");
        }


    }
}
