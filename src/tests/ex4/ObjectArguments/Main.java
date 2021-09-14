package tests.ex4.ObjectArguments;

public class Main {

    // sending objects like arguments

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car = new Car("BMW");
        Car car1 = new Car("Tesla");


        garage.park(car);
        garage.park(car1);
    }
}
