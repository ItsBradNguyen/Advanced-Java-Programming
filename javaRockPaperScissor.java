import java.util.Scanner;
import java.lang.Math.*;

public class javaRockPaperScissor
{

    public static void main(String[] args)
    {
        //introduction
        System.out.println("Welcome to javaRockPaperScissor. \nWould you like to play against me? \nThere are 3 moves you can make: Rock, Paper, Scissor. \nThere rules are: \n   Rock beats Scissor, \n   Paper beats Rock, \n   Scissor beats Paper");
        
        //computerRNG
        int computerRNG = (int) Math.round(Math.random()*2);

        //computerMove
        String computerMove = "";

        //computer Logic
        if (computerRNG == 0)
        {
            computerMove = "Rock";
        } else if (computerRNG == 1)
        {
            computerMove = "Paper";
        } else if (computerRNG == 2)
        {
            computerMove = "Scissor";
        }

        //scanner
        Scanner input = new Scanner(System.in);

        //player
        System.out.print("Which move do you want to play? ");
        String userMove = input.next();

        //validMove
        boolean validMove = true;

        //validMove Logic
        if (userMove.toLowerCase().equals("rock") || userMove.toLowerCase().equals("paper") || userMove.toLowerCase().equals("scissor"))
        {
            validMove = true;
        } else
        {
            validMove = false;
        }
        while (validMove == false)
        {
            System.out.print("Invalid Move! Try a different one: ");
            userMove = input.next();
            if (userMove.toLowerCase().equals("rock") || userMove.toLowerCase().equals("paper") || userMove.toLowerCase().equals("scissor"))
            {
                validMove = true;
            } else
            {
                validMove = false;
            }
        }

        //gamePlay
        System.out.println("The computer has played " + computerMove);

        //gamePlay Logic
        if (userMove.toLowerCase().equals(computerMove.toLowerCase()))
        {
            System.out.println("It is a tie!!");
        } else if (userMove.toLowerCase().equals("rock") && computerMove.toLowerCase().equals("scissor")
        || userMove.toLowerCase().equals("paper") && computerMove.toLowerCase().equals("rock")
        || userMove.toLowerCase().equals("scissor") && computerMove.toLowerCase().equals("paper"))
        {
            System.out.println("You won! Congratulations!!");
        } else if (userMove.toLowerCase().equals("rock") && computerMove.toLowerCase().equals("paper")
        || userMove.toLowerCase().equals("paper") && computerMove.toLowerCase().equals("scissor")
        || userMove.toLowerCase().equals("scissor") && computerMove.toLowerCase().equals("rock"))
        {
            System.out.println("You lost! Tough luck!!");
        }
    }
}