package tests.ex11.Interface;

public class Fish implements Prey, Predator {
    @Override
    public void hunt() {

        System.out.println("the fish is hunting smaller fish");

    }

    @Override
    public void flee() {
        System.out.println("this fish is fleeing from a larger fish");

    }
}
