package questionsApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String q1 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
        String q2 = "What color are bananas?\n" + "(a)red/green\n(b)Yellow\n(c)Blue\n";
        String q3 = "What color are strawberries\n" + "(a)red\n(b)Cyan\n(c)Black\n";

        Questions[] questions = {
                new Questions(q1, "a"),
                new Questions(q2, "b"),
                new Questions(q3, "a")
        };

        takeTest(questions);

    }

    public static void takeTest(Questions[] questions) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(questions[i].answer)) {
                score++;

            }

        }
        System.out.println("You got " + score + "/" + questions.length);
    }
}
