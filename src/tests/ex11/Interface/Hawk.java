package tests.ex11.Interface;

public class Hawk implements Predator {

    @Override
    public void hunt() {
        System.out.println("the hawk is hunting");
    }
}
