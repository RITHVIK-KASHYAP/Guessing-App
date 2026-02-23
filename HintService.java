/*
Guessing App UC1 - Coded to show rules of the game 

@author Rithvik
<<<<<<< HEAD
@version 3.0
=======
@version 4.0
>>>>>>> feature/UC4GuessingApp

*/
public  class HintService
{
    public static String generateHint(int target, int hintCount)
    {
        if(hintCount==1)
        {
            return(target%2==0)
            ?"Hint: Number is EVEN"
            :"Hint: Number is ODD";
        }
        else if (hintCount==2)
        {
            return(target>50)
            ?"Hint: Number is greater than 50"
            :"Hint: Number is 50 or less";
        }
        return "No more hints available";
    }
    
}
