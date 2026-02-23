/*

@author Rithvik
@version 6.0

*/
import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args) throws Exception  {
        Scanner scanner = new Scanner(System.in);
        boolean restart;

        System.out.println("========================");
        System.out.println("Welcome to Guessing App");
        System.out.println("========================");
        do
        {
                
            System.out.print("Enter Player Name: ");
            String player = scanner.nextLine();

            GameConfig config=new GameConfig();
            config.showRules();
            
            int attempts =0;
            int hintsUsed=0;

            boolean win = false;

            while(attempts<config.getMaxAttempts())
            {
                System.out.print("Enter your guess:");
                int guess = ValidationService.validateInput(scanner.nextLine());
                attempts++;
                String result= GuessValidator.validateGuess(guess, config.getTargetNumber());
                if(!"CORRECT".equals(result) && hintsUsed < config.getMaxAttempts())
                {
                    hintsUsed++;
                    System.out.println(HintService.generateHint(config.getTargetNumber(), hintsUsed));
                }
                System.out.println(result);
            
                if ("CORRECT".equals(result))
                {
                    win=true;
                    break;
                }
            }
            StorageService.saveResult(player, attempts, win);
            restart = GameController.restartGame(scanner);
        } while(restart);
    }    
}
