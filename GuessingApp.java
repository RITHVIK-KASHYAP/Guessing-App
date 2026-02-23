/*
Guessing App UC1 - Coded to show rules of the game 

@author Rithvik
@version 1.0

*/
import java.util.Random;
import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args){
        System.out.println("Welcome to Guessing App");
        GameConfig config=new GameConfig();
        config.showRules();
        Scanner scanner = new Scanner(System.in);
        int attempts =0;
        while(attempts<config.getMaxAttempts())
        {
            System.out.print("Enter your guess:");
            int guess = scanner.nextInt();
            attempts++;
            String result= GuessValidator.validateGuess(guess, config.getTargetNumber());
            System.out.println(result);
        
        if ("CORRECT".equals(result))
        {
            break;
        }
    }
}

    
}

