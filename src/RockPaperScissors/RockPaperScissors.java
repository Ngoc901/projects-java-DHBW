package RockPaperScissors;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public void startGame() {

        // Declaring variables
        String playersChoice;
        int compScore = 0;
        int playerScore = 0;
        int decision = 0;
        boolean wantExit = false;
        String[] choices = {"rock", "paper", "scissors", "exit"};

        // Introduction
        System.out.println("Welcome to Rock Paper Scissors!");

        while (!wantExit) {

            playersChoice = getPlayerChoice();

            boolean validChoice = Arrays.asList(choices).contains(playersChoice);
            if (validChoice) {
                if (playersChoice.equals("exit")) {
                    wantExit = true;
                    break;
                }
                String compChoice = getCompChoice();
                System.out.println("Your move: " + playersChoice);
                System.out.println("Computer's move: " + compChoice);

                decision = getDecision(compChoice, playersChoice);
                switch (decision) {
                    case 0:
                        break;
                    case 1:
                        playerScore++;
                        break;
                    case 2:
                        compScore++;
                        break;
                }
                getDecisionInText(decision);
            }else{
                System.out.println("Invalid Choice");
            }
        }
        getResult(compScore, playerScore);
    }

    public static int getDecision (String compMove, String playerMove){
    // 0 tie
    // 1 Player wins
    // Computer wins
        int decision = -1;
        switch(compMove) {
            case "rock":
                switch (playerMove){
                    case "rock":
                        decision = 0;
                        break;
                    case "paper":
                        decision = 1;
                        break;
                    case "scissors":
                        decision = 2;
                        break;
                }
                break;
            case "paper":
                switch (playerMove){
                    case "rock":
                        decision = 2;
                        break;
                    case "paper":
                        decision = 0;
                        break;
                    case "scissors":
                        decision = 1;
                        break;
                }
                break;
            case "scissors":
                switch (playerMove){
                    case "rock":
                        decision = 1;
                        break;
                    case "paper":
                        decision = 2;
                        break;
                    case "scissors":
                        decision = 0;
                        break;
                }
                break;
        };
        return decision;

    }

    public static String getCompChoice(){
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        int move = random.nextInt(3);
        return choices[move];
    }

    public static void getDecisionInText (int result){
        switch (result)
        {
            case 0:
                System.out.println("It's a tie!");
                break;
            case 1:
                System.out.println("You won!");
                break;
            case 2:
                System.out.println("Computer won!");
                break;

        }
    }

    public static void getResult(int compScore, int playerScore){
        System.out.println("-----------------------");
        System.out.println("Thank you for playing!");
        System.out.println("Player's score:" + playerScore);
        System.out.println("Computer's score:" + compScore);
    }

    public static String getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.print("Please enter your choice / Rock / Paper / Scissors / Exit): ");
        String playersChoice = scanner.nextLine();
        playersChoice = playersChoice.trim().toLowerCase();

        return playersChoice;
    }

}
