package tests.ex8.Super;


public class Main {

    // super = keyword refers to the superclass (parent) of an object
    //         very similar to the "this" keyword

    public static void main(String[] args) {

        Hero hero1 = new Hero("Batman", 42, "brain");
        Hero hero2 = new Hero("Superman", 33, "infinite");


        System.out.println(hero2.toString());
        System.out.println(hero1.toString());

    }
}
