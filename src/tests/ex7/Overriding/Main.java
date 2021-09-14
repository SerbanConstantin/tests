package tests.ex7.Overriding;

public class Main {

    // method overriding = declaring a method in sub class, which is already present in parent class.
    //                     done so that a child can give its own implementation

    public static void main(String[] args) {

        Dog dog = new Dog();
        Animal animal = new Animal();

        animal.speak();
        dog.speak();

    }

}
