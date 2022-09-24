//imports
import java.util.Scanner;
import java.lang.Math.*;


public class javaRockPaperScissor
{
    //user
    static String user()
    {
        //userInform
        System.out.println("Rock");
        System.out.println("Paper");
        System.out.println("Scissor");
        
        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Which move do you want to play? ");
        String userInput = input.next();

        //validMove
        boolean validMove = true;

        //validMove Logic
        if (userInput.toUpperCase().equals("ROCK") || userInput.toUpperCase().equals("PAPER") || userInput.toUpperCase().equals("SCISSOR"))
        {
            validMove = true;
        } else
        {
            validMove = false;
        }
        while (validMove == false)
        {
            System.out.print("Invalid Move! Try a different move: ");
            userInput = input.next();

            if (userInput.toUpperCase().equals("ROCK") || userInput.toUpperCase().equals("PAPER") || userInput.toUpperCase().equals("SCISSOR"))
            {
                validMove = true;
            } else
            {
                validMove = false;
            }
        }

        //shoot
        System.out.println("SHOOT!");

        //outcome
        return userInput;
    }

    //computer
    static Double computer()
    {
        double randomNumber = Math.random() * 2;
        double computerRNG = Math.round(randomNumber);
        
        //outcome
        return computerRNG;
    }
    public static void main(String[] args)
    {
        //user Function
        user();
        
        //computer Function
        computer();

        //computerMove
        String computerMove = "";
        
        //computerMove Logic
        if (computer() == 0)
        {
            computerMove = "Rock";
        } else if (computer() == 1)
        {
            computerMove = "Paper";
        } else if (computer() == 2)
        {
            computerMove = "Scissor";
        }

        //game Logic
        if (user().equals(computerMove))
        {
            System.out.println("It's a tie!");
        } else if (user().toLowerCase().equals("rock") & computerMove.toLowerCase().equals("scissor")
            || user().toLowerCase().equals("paper") & computerMove.toLowerCase().equals("rock")
            || user().toLowerCase().equals("scissor") & computerMove.toLowerCase().equals("paper"))
        {
            System.out.println("You won! Congratulations");
        } else
        {
            System.out.println("You lost! Bad Luck");
        }
    }
}