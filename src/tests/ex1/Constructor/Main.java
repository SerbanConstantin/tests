package tests.ex1.Constructor;


public class Main {

    // constructor = special method that is called when an object is instantiate ( created )

    public static void main(String[] args) {

        Human human = new Human("Toma", 20, 45.5, 180);
        Human human1 = new Human("Ion", 55, 75.5, 175);
        Human human2 = new Human("Mihai", 16, 71.3, 167);
        Human human3 = new Human("Geo", 10, 25.6, 140);

//        System.out.println(human1.name);
//        System.out.println(human.name);
//        System.out.println(human2.name);
//        System.out.println(human3.name + " age " +human3.age);

        human.eat();
        human1.drink();
        human2.running();
        human3.sleeping();
    }


}
