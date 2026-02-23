/*

@author Rithvik
@version 6.0

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
