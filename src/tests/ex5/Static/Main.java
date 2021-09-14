package tests.ex5.Static;

public class Main {

    // static = modifier. A single copy of a variable/method is created and shared
    //          the class "owns" the static member

    public static void main(String[] args) {

        Friend friend1 = new Friend("Ion");
        Friend friend2 = new Friend("Mihai");
        Friend friend3 = new Friend("Vasile");
        Friend friend4 = new Friend("Matei");

        Friend.displayFriends();




    }
}
