/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Task01_2;
import java.util.Scanner;

public class ShapeCalculator2 
{
    //NOTE: Intead of terminating the program when an invalid response is inputted I have altered it so that it will keep asking the user to repeat
    // their answer until they get the input correct, or given them the option to exit the program at any time
    
    private static final String terminateProgramPrompt = "exit";
    
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner scanner = new Scanner(System.in);
        
        int userInput = queryUser(scanner);
        
        switch (userInput)
        {
            case 0:
                //this will terminate the program
                utilities_TERMINATE_PROGRAM();
            case 1:
                System.out.println("\n[Rectangle]:");
                System.out.println("Please input the length:");
                double length = utilities_VALID_DOUBLE(scanner);
                System.out.println("Please input the width:");
                double width = utilities_VALID_DOUBLE(scanner);
                
                createDisplayRectangle(length, width);
                break;
            
            case 2:
                System.out.println("\n[Circle]:");
                System.out.println("Please input the radius:");
                double radius = utilities_VALID_DOUBLE(scanner);
                
                createDisplayCircle(radius);
                break;
            
            case 3:
                System.out.println("\n[Square]:");
                System.out.println("Please input the side length:");
                double sideLength = utilities_VALID_DOUBLE(scanner);
                
                createDisplaySquare(sideLength);
                break;
            
        }
    }
    
    public static int queryUser(Scanner scanner)
    {
        boolean validInteger = false;
        int result = -1;
        
        while(!validInteger)
        {
            System.out.println("Please select:");
            System.out.println("(1) Rectangle");
            System.out.println("(2) Circle");
            System.out.println("(3) Square");
            System.out.println("");
            System.out.println("(TYPE: \"exit\") Terminate Program");
            
            if(scanner.hasNextInt())
            {
                int targetNumber = scanner.nextInt();
                scanner.nextLine();
                if(targetNumber >= 1 && targetNumber <= 3)
                {
                    result = targetNumber;
                    validInteger = true;
                }
                else
                {
                    System.out.println("ERROR: [Please enter (1, 2 or 3)]\n");
                }
                
            }
            else
            {
                String userInput = scanner.nextLine();
                if(userInput.equalsIgnoreCase(terminateProgramPrompt))
                {
                    result = 0;
                    validInteger = true;
                }
                else
                {
                System.out.println("ERROR: [Please return input of type Integer]\n");
                }
            }
        }
        
        
        return result;
    }
    
    public static void createDisplayRectangle(double length, double width)
    {
        Rectangle rectObj = new Rectangle(length, width);
        rectObj.calculateArea();
        rectObj.printInfo();
    }
    public static void createDisplayCircle(double radius)
    {
        Circle cirObj = new Circle(radius);
        cirObj.calculateArea();
        cirObj.printInfo();
    }
    public static void createDisplaySquare(double size)
    {
        Square squObj = new Square(size);
        squObj.calculateArea();
        squObj.printInfo();
    }
    
    public static double utilities_VALID_DOUBLE(Scanner scanner)
    {
        boolean valid = false;
        double answer = -1;
        
        while(!valid)
        {
            String userInput = scanner.nextLine().trim();
            
            if(userInput.equalsIgnoreCase(terminateProgramPrompt))
            {
                utilities_TERMINATE_PROGRAM();
            }
            
            try
            {
                answer = Double.parseDouble(userInput);
                valid = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Input: Please enter a double or \"exit\" to terminate program...");
            }
        }
        
        return answer;
    }

    public static void utilities_TERMINATE_PROGRAM()
    {
        System.out.println("Terminating program...");
        System.exit(0);
    }
}
