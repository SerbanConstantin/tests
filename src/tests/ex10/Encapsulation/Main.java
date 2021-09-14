package tests.ex10.Encapsulation;

public class Main {

    // encapsulation = attributes of a class will be hidden or private,
    //                 can be accessed only through methods ( getters @ setters)
    //                 you should make attributes private if you don't have a reason to make them public/protected

    public static void main(String[] args) {

        Car car = new Car("Dacia", "Jogger", 2021);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


        car.setMake("Lexus");
        car.setModel("LS");
        car.setYear(2022);

        System.out.println(car.getYear());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
    }
}
