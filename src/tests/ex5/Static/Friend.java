package tests.ex5.Static;

public class Friend {

    String name;
    static int numberOfFriends;


    public Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("you have " + numberOfFriends + " Friends");
    }
}
