package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions =
                {
                "What is the capital of Illinois?" ,
                "What is the state flower of Illinois (two words)?",
                "What is the state animal of Illinois (three words)?",
                "Who is the first (and currently only) president of the United States born in Illinois?",
                "One of the tallest building in the world is located in Chicago, Illinois. What is it currently called (two words)?"
        };
        String[] answers = {"Springfield", "Blue Violet", "White tailed deer", "Ronald Reagan", "Willis Tower"}; // Must be parallel to question[]

        int score = 0;

        for (int i = 0; i < questions.length; i++) { // loops through questions[], asks user for an answer, compares user's answer with answers[]
            System.out.println("Question " + (i+1) + ": " + questions[i]);
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase(answers[i])){
                System.out.println("Correct!");
                score++;
            }
            else {
                System.out.println("Wrong Answer");
            }
        }

        System.out.println("You got " + score + " points");

        switch (score){ // Assuming that only 5 questions exists
            case 0:
            case 1:
                System.out.println("Aww, too bad. Don't give up. Try again");
                break;
            case 2:
                System.out.println("You can do better than that. Try again");
                break;
            case 3:
                System.out.println("Not bad");
                break;
            case 4:
                System.out.println("Good Job!");
                break;
            case 5:
                System.out.println("Perfect Score! Amazing!");
                break;

        }
    }
}
