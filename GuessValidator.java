/*
Guessing App UC1 - Coded to show rules of the game 

@author Rithvik
<<<<<<< HEAD
@version 3.0
=======
@version 4.0
>>>>>>> feature/UC4GuessingApp

*/
public class GuessValidator
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