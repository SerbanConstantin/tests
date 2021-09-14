package tests.ex2.OverloadConstructor;

public class Main {

    //overloaded constructors = multiple constructors within a class with the same name, but have different parameters
    //                          name + parameters = signature

    public static void main(String[] args) {

        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("The ingredients of pizza");
        System.out.println(pizza.bread + "\n" + pizza.sauce + "\n" + pizza.cheese + "\n" +pizza.topping);

        Pizza pizza1 = new Pizza("thicc crust");
        System.out.println("The ingredients of pizza1");
        System.out.println(pizza1.bread);

        Pizza pizza2 = new Pizza("thicc crust", "tomato");
        System.out.println("The ingredients of pizza2");
        System.out.println(pizza2.bread + "\n" + pizza2.sauce);

        Pizza pizza3 = new Pizza("thicc crust", "tomato", "mozzarella");
        System.out.println("The ingredients of pizza3");
        System.out.println(pizza3.bread + "\n" + pizza3.sauce + "\n" + pizza3.cheese);

        Pizza pizza4 = new Pizza();
        System.out.println("Pizza with no ingredients");
        System.out.println(pizza4.topping);

    }
}
