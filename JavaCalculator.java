import java.util.Scanner;

public class JavaCalculator{
    
    //basicCalculator function
    public static double basicCalculator(){
        Scanner input = new Scanner(System.in);
        
        //num1
        System.out.print("Enter a number: ");
        double num1 = input.nextDouble();
        
        //operator
        System.out.print("Enter an operator: ");
        String operator = input.next();
        boolean validOperator = false;
        
        //validOperator Logic 
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            validOperator = true;
        } else {
            validOperator = false;
        }
        while (validOperator == false) {
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                validOperator = true;
            } else {
                validOperator = false;
                System.out.print("Syntax error! Try a different operator: ");
                operator = input.next();
            }
        }
        //num2
        System.out.print("Enter a second number: ");
        double num2 = input.nextDouble();            
        
        //result
        double result = 0;
        
        //operator Logic
        if (operator.equals("+")) {
            result = num1 + num2;            
        } else if (operator.equals("-")) {
            if (num1 < num2) {
                result = - (num2 - num1);
            } else {
                result = num1 - num2;
            }
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        }
        System.out.print("The result is " + result);
        return result;
    }

    //main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Java Calculator!");
        System.out.println("This calculator can perform basic calculations \nand find circumference and area of geometric shapes.");
        System.out.println("There are three functions to use: basic, circumference, and area.");
        System.out.print("\nWhich function would you like to use? ");
        String userInput = input.next();

        //userInput Logic 
        if (userInput.equals("basic")) {
            basicCalculator();
        } else {
            System.out.print("404 error code.");
        }
    }
}