import java.lang.Math.*;
import java.util.Scanner;

public class javaRockPaperScissor {
    //computer function
    public static void computer(){
        Double computerRNG = Math.random() * 2;
        
        String computerPlay = "Rock".toUpperCase();
        //computerPlay Logic
        if (computerRNG == 0) {
            computerPlay = "Rock".toUpperCase();
        } else if (computerRNG == 1) {
            computerPlay = "Paper".toUpperCase();
        } else if (computerRNG == 2) {
            computerPlay = "Scissor".toUpperCase();
        }
        System.out.print("The computer has played " + computerPlay.toLowerCase() + ".");
    }

    //userInput function
    public static void user() {
        //Scanner 
        Scanner input = new Scanner(System.in);

        //userInput
        System.out.print("What would you like to play? ");
        String userInput = input.next().toUpperCase();

        //validInput
        boolean validInput = true;

        //validInput Logic
        if (userInput.equals("ROCK") || userInput.equals("PAPER") || userInput.equals("SCISSOR")) {
            validInput = true;
        } else {
            validInput = false;
        }
        while (validInput == false) {
            System.out.print("Invalid input. Try a different one: ");
            userInput = input.next();
            if (userInput.equals("ROCK") || userInput.equals("PAPER") || userInput.equals("SCISSOR")) {
                validInput = true;
            } else {
                validInput = false;
            }
        }
    } 
    
    public static void main(String[] args) {
        //introduction
        System.out.println("Welcome to javaRockPaperScissor!");
        System.out.println("This game is fairly simple; the rules are: \nRock beats Scissor\nScissor beats Paper\nPaper beats Rock");

        //userInput
        user();
        
        //computer
        computer();
        
    }
}