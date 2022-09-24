//import
import java.util.Scanner;

public class javaOddorEven
{
    
    public static void main(String[] args)
    {
        //scanner
        try (Scanner input = new Scanner(System.in))
        {
            System.out.println("Welcome to javaOddorEven. \nThis program tests if a number is off or even.");
            System.out.print("Please enter a number: ");
            int userInput = input.nextInt();

            //logic
            if (userInput%2 == 0)
            {
                System.out.println(userInput + " is an even number");
            } else
            {
                System.out.println(userInput + " is an odd number");
            }
        }
    }
}