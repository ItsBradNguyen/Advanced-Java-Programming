import java.util.Scanner;
import java.lang.Math.*;

public class JavaCalculator{
    
    //basicCalculator function
    public static double basicCalculator(){
        //basicCalculator Operators Information
        System.out.print("This basic calculator can add(+), substract(-), multiply(*), and divide(/) any two inputted numbers.");
        
        //scanner
        Scanner input = new Scanner(System.in);
        
        //num1
        System.out.print("Please enter your first number: ");
        double num1 = input.nextDouble();
        
        //operator
        System.out.print("Please enter an operator: ");
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
        System.out.print("Please enter your second number: ");
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
        
        //outcome
        System.out.print("The result is " + result);
        return result;
    }

    //circumferenceCalculator function
    public static double circumferenceCalculator() {
        //shapes Information
        System.out.println("This calculator can find the circumference of Triangle, Rectangle, Square, Circle, Parallelogram, Trapezoid, and Ellipse.");

        //scanner 
        Scanner input = new Scanner(System.in);

        //shape
        System.out.print("What is the geometric shape of the object? ");
        String shape = input.next();
        boolean validShape = true;

        //validShape Logic
        if (shape.equals("Triangle") || shape.equals("Rectangle") || shape.equals("Square") || shape.equals("Circle") || shape.equals("Parallelogram") || shape.equals("Trapezoid") || shape.equals("Ellipse")) {
            validShape = true;
        } else {
            validShape = false;
        }
        while (validShape == false) {
            System.out.print("Invalid Shape. Try again: ");
            shape = input.next();
            if (shape.equals("Triangle") || shape.equals("Rectangle") || shape.equals("Square") || shape.equals("Circle") || shape.equals("Parallelogram") || shape.equals("Trapezoid") || shape.equals("Ellipse")) {
                validShape = true;
            } else {
                validShape = false;
            }
        }

        //result
        double result = 0;

        //shape Logic
        if (shape.equals("Triangle")) {            
            //side1
            System.out.print("Please enter the length of the first side: ");
            Double side1 = input.nextDouble();
            //side2
            System.out.print("Please enter the length of the second side: ");
            Double side2 = input.nextDouble();
            //side3
            System.out.print("Please enter the length of the third side: ");
            Double side3 = input.nextDouble();
            //circumference
            result = side1 + side2 + side3;
        } else if (shape.equals("Rectangle")) {
            //side1
            System.out.print("Please enter the length of the first side: ");
            Double side1 = input.nextDouble();
            //side2
            System.out.print("Please enter the length of the second side: ");
            Double side2 = input.nextDouble();
            //circumference
            result = 2 * (side1 + side2);
        } else if (shape.equals("Circle")){
            //radius
            System.out.print("Please enter the radius: ");
            double radius = input.nextDouble();
            //circumference
            result = 2 * Math.PI * radius;
        } else if (shape.equals("Parallelogram")) {
            //side1
            System.out.print("Please enter the length of the first side: ");
            Double side1 = input.nextDouble();
            //side2
            System.out.print("Please enter the length of the second side: ");
            Double side2 = input.nextDouble();
            //circumference
            result = 2 * (side1 + side2);
        } else if (shape.equals("Trapezoid")) {
            //parallelSide1
            System.out.print("Please enter the length of the first parallel side: ");
            Double parallelSide1 = input.nextDouble();
            //parallelSide2
            System.out.print("Please enter the length of the second parallel side: ");
            Double parallelSide2 = input.nextDouble();
            //leg
            System.out.print("Please enter the length of the leg: ");
            Double leg = input.nextDouble();
            //circumference
            result = parallelSide1 + parallelSide2 + leg * 2;
        } else if (shape.equals("Ellipse")) {
            //longRadius
            System.out.print("Please enter the semi-major radius: ");
            double longRadius = input.nextDouble();
            //shortRadius
            System.out.print("Please enter the semi-minor radius: ");
            double shortRadius = input.nextDouble();
            //h
            double h = ((longRadius-shortRadius)*(longRadius-shortRadius))/((longRadius+shortRadius)*(longRadius+shortRadius));
            //circumference
            result = Math.PI * (longRadius + shortRadius) * (1 + ((3 * h) / (10 + Math.sqrt(4 - (3 * h)))));
        }

        //outcome
        System.out.print("The circumference of your " + shape + " is " + result);
        return result;
    }
    
    //areaCalculator function
    public static double areaCalculator(){
        //shapes Information
        System.out.println("This calculator can find the circumference of Triangle, Rectangle, Square, Circle, Parallelogram, Trapezoid, and Ellipse.");

        //scanner 
        Scanner input = new Scanner(System.in);

        //shape
        System.out.print("What is the geometric shape of the object? ");
        String shape = input.next();
        boolean validShape = true;

        //validShape Logic
        if (shape.equals("Triangle") || shape.equals("Rectangle") || shape.equals("Square") || shape.equals("Circle") || shape.equals("Parallelogram") || shape.equals("Trapezoid") || shape.equals("Ellipse")) {
            validShape = true;
        } else {
            validShape = false;
        }
        while (validShape == false) {
            System.out.print("Invalid Shape. Try again: ");
            shape = input.next();
            if (shape.equals("Triangle") || shape.equals("Rectangle") || shape.equals("Square") || shape.equals("Circle") || shape.equals("Parallelogram") || shape.equals("Trapezoid") || shape.equals("Ellipse")) {
                validShape = true;
            } else {
                validShape = false;
            }
        }

        //result
        double result = 0;

        //shape Logic
        if (shape.equals("Triangle")) {            
            //height
            System.out.print("Please enter the length of the height: ");
            Double height = input.nextDouble();
            //base
            System.out.print("Please enter the length of the base: ");
            Double base = input.nextDouble();
            //area
            result = 0.5 * base * height;
        } else if (shape.equals("Rectangle")) {
            //side1
            System.out.print("Please enter the length of the first side: ");
            Double side1 = input.nextDouble();
            //side2
            System.out.print("Please enter the length of the second side: ");
            Double side2 = input.nextDouble();
            //area
            result = side1 * side2;
        } else if (shape.equals("Circle")){
            //radius
            System.out.print("Please enter the radius: ");
            double radius = input.nextDouble();
            //area
            result = Math.PI * Math.pow(radius, 2);
        } else if (shape.equals("Parallelogram")) {
            //height
            System.out.print("Please enter the length of the height: ");
            Double height = input.nextDouble();
            //base
            System.out.print("Please enter the length of the base: ");
            Double base = input.nextDouble();
            //area
            result = base * height;
        } else if (shape.equals("Trapezoid")) {
            //smallParallel
            System.out.print("Please enter the length of the small parallel side: ");
            Double smallParallel = input.nextDouble();
            //longParallel
            System.out.print("Please enter the length of the long parallel side: ");
            Double longParallel = input.nextDouble();
            //height
            System.out.print("Please enter the length of the height: ");
            Double height = input.nextDouble();
            //area
            result = (smallParallel + longParallel) * height * 0.5;
        } else if (shape.equals("Ellipse")) {
            //longRadius
            System.out.print("Please enter the semi-major radius: ");
            double longRadius = input.nextDouble();
            //shortRadius
            System.out.print("Please enter the semi-minor radius: ");
            double shortRadius = input.nextDouble();
            //area
            result = Math.PI * longRadius * shortRadius;
        }

        //outcome
        System.out.print("The area of your " + shape + " is " + result);
        return result;
    }


    //main function
    public static void main(String[] args) {
        //scanner 
        Scanner input = new Scanner(System.in);
        
        //intro
        System.out.println("Welcome to Java Calculator!");
        System.out.println("This calculator can perform basic calculations \nand find circumference and area of geometric shapes.");
        System.out.println("There are three functions to use: Basic, Circumference, and Area.");
        System.out.print("\nWhich function would you like to use? ");
        String userInput = input.next();

        //validInput
        boolean validInput = true;

        //validInput Logic
        if (userInput.equals("Basic") || userInput.equals("Circumference") || userInput.equals("Area")) {
            validInput = true;
        } else {
            validInput = false;
        }
        while (validInput == false) {
            System.out.print("Invalid function. Try again: ");
            userInput = input.next();
            if (userInput.equals("Basic") || userInput.equals("Circumference") || userInput.equals("Area")) {
                validInput = true;
            } else {
                validInput = false;
        }
    }
        //userInput Logic 
        if (userInput.equals("Basic")) {
            basicCalculator();
        } else if (userInput.equals("Circumference")) {
            circumferenceCalculator();
        } else if (userInput.equals("Area")) {
            areaCalculator();
        } else {
            System.out.print("404 error code.");
        }
    }
}