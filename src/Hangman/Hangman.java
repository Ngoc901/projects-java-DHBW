package Hangman;

import java.util.Random;
import java.util.Scanner;
//Hangman game
// Input word
// Input letters until the user has lives
// Checking if the user has guessed correctly
// Counting life
// Draw shape if not
// Maybe adding tips?

public class Hangman {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Array for the secret words
        String[] secretWords = {"awkward", "jawbreaker", "fluffiness", "buzzwords", "rocket"};
        // Randomly selecting one 
        Random rand = new Random();
        String secretWord = secretWords[rand.nextInt(secretWords.length)];
        // Attempts available for guessing
        int attempts = 5; 
        //Won or not
        boolean won = false;
       

        // Kepping track of the guessed letters
        char[] guessedLetters = new char[secretWord.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            // Initially it is not filled with letters
            guessedLetters[i] = '_';
        }

        //Introduction
        System.out.println("Welcome to Hangman!");
        System.out.println("You have " + attempts + " attempts to guess the word");


        // Game starts until the user runs out of attempts
        while (attempts>0 && !won) { 
            for(char letters:guessedLetters){
                // After every guess it print out the word
                System.out.print(letters);
            }
            System.out.println("");
            
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            boolean found = false;
            // Checking if the letter is in the secret word
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    found = true;
                }
            }
            // It is not in the secret word
            if(!found){
                attempts--;
                System.err.println("Incorrect guess. You have " + attempts + " left");
            }
            //Guessed all
            if (String.valueOf(guessedLetters).equals(secretWord)) {
                System.out.println("You guessed the word! Not so dumb, are you?");
                won = true;
            }
            //Ran out of attempts
            if(attempts == 0){
                System.err.println("You ran out of attempts. You are dumb, the word was " + secretWord);
            }
        }

        
    }
}
   


    
