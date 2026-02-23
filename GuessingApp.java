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
class GuessValidator
{
    public static String validateGuess(int guess, int target)
    {
        if(guess == target)
        {
            return "CORRECT";
        }
        else if (guess<target)
        {
            return "LOW";
        }
        return "HIGH";
    }
}
class GameConfig
{
    private final int MIN = 1;
    private final int MAX = 100;
    private final int MAX_ATTEMPTS= 7;
    private final int MAX_HINTS = 3;
    int targetNumber;
    public GameConfig(){
        Random random = new Random();
        this.targetNumber=random.nextInt(MAX-MIN +1)+MIN;
    }
    public int getTargetNumber(){ return targetNumber;}
    public int getMaxAttempts(){return MAX_ATTEMPTS;}
    public int getMaxHints(){ return MAX_HINTS; }
    public void showRules(){
        System.out.println("Guess a number between"+MIN +" and "+MAX);
        System.out.println("You Are "+MAX_ATTEMPTS);
        System.out.println("Hints will be provided after wrong guesses.\n");
        
    }
}
