package tests.ex12.Polymorphism;


public class Main {

    // polymorphism = the ability of an object to identify as more that one type
    //                 "poly" = many, "morph" = form

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        for (Vehicle x: racers) {

            x.go();
        }


        
        
        




    }
}
