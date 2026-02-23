/*
Guessing App UC1 - Coded to show rules of the game 

@author Rithvik
@version 1.0

*/
import java.util.Random;
public class GuessingApp {
    public static void main(String[] args){
        System.out.println("Welcome to Guessing App");
        GameConfig gameConfig=new GameConfig();
        gameConfig.showRules();
    }

    
}

