package tests.ex3.toString;

public class Main {

    //toString() = special method that all objects inherit,
    //             that returns a string that "textually represent" an object.
    //             can be used in both implicitly and explicitly

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.toString()); // explicitly

        System.out.println(car); // implicitly


    }
}
