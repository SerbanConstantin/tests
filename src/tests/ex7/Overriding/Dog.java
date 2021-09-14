package tests.ex7.Overriding;

public class Dog extends Animal {

    @Override
    void speak(){
        System.out.println("the dog goes *bark* ");
    }

}
