/*


@author Rithvik
@version 5.0
>>>>>>> feature/UC5GuessingApp

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