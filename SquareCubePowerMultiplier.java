
package squarecubepowermultiplier;

import java.util.Scanner; // imports the scanner which will be used

// Program Name: SquareCubePowerMultiplier
// Date Started: July 14, 2021
// Author: Me
// Purpose: using the console as input, create a program which can square, cube or otherwise use exponents to multiply a designated number

public class SquareCubePowerMultiplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // set variables first - there wont be much if any fixed variables
        String optionChosen; // variable used for the user to be able to choose an initial option out of 1 2 3 or anything else. string chosen so the switch operator works, and any other characters can be used to end program
        int exponentMultiplier; // varaible used to store the exponent - needed for multiplication loops due to the nature of exponents. cannot be a decimal as that doesnt make sense
        double userValueMultiplied; // variable used to store the value inputed by the user to be multiplied - we do not discriminate, so decimals are welcome too
        double userValueBase; //variable used to store base number entered by the user. this is the number which will used to modify the userValueMultiplied, as if it is used to multiply itself, then you quickly end up with exponention exponents, which is not what we want
        
        boolean runProgram = true; // boolean used by the main loop to decide whether or not to end the program or redisplay the choice board - initially true

        
        Scanner keyedInput = new Scanner(System.in); // activates scanner
        
        
        
        // intro message to the program        
        System.out.println("Hallo, and welcome to SquareCubePowerMultiplier.");
        System.out.println("This program allows you to square, cube or multiply a number by itself X times and get a result.");
        System.out.println("Without further ado, lets get into it. Input any key to continue");
        
                
        while (runProgram == true) // the overarching main looping body. Will repeatedly attempt to loop until otherwise told to stop. 'while' loop chosen because we don't know how much runs the user wants
        {
            
            // "main menu" message - displayed at start of every loop
            System.out.println("");
            System.out.println("--- MAIN MENU ---");
            System.out.println("Here are your options");
            System.out.println("Input 1, 2, or 3 to choose an option. You may enter any other key to stop program");
            System.out.println("Option 1: Square a Number (N x N)");
            System.out.println("Option 2: Cube a Number (N x N x N)");
            System.out.println("Option 3: Multiply a Number X times (N^X)");
            
            optionChosen = keyedInput.nextLine(); // gets the user's option chosen, and will over write previous inputs
            
            
            // options below
            if (optionChosen.equals("1")) // if the user inputs 2 (cube a number)
            {
                // option 1 selected message 
                System.out.println("");
                System.out.println("--- OPTION 1 ---");
                System.out.println("You have chosen to square a number.");
                System.out.println("please input the number you will be squaring."); // requests number input

                userValueBase = keyedInput.nextDouble(); // gets the user's number chosen
                userValueMultiplied = userValueBase; // copies base onto multiplied
                
                exponentMultiplier = 2; // initializes exponent multiplier
                
                
                // output message
                System.out.println("");
                System.out.println("So you have chosen to square " + userValueBase + ".");
                System.out.println("The equation looks like this " + userValueBase + "^" + exponentMultiplier + ".");                
                
                //the actual exponent machine
                for (exponentMultiplier = exponentMultiplier; exponentMultiplier > 1 ; exponentMultiplier = exponentMultiplier - 1) // since exponent multiplier was initialised earlier, it can refrence itself here, and will run until exponent hits 1. (exponent of 1 does nothing)
                {
                    userValueMultiplied = userValueMultiplied * userValueBase; // multiplies product by value - acts like exponent
                }
                
                // this message displays the answer
                System.out.println("so the final answer is " + userValueMultiplied + ".");
                
                // instructions on returning
                System.out.println("Enter any key to return to Main Menu."); 
                
                // these few lines dont actually keep track of the user's input. instead, they keep console cleaner, by requiring an input to return to the menu. they also reset the optionChosen input value
                optionChosen = keyedInput.nextLine();
                optionChosen = keyedInput.nextLine();
                System.out.println("Returning to Main Menu...");
            }
            
            else if (optionChosen.equals("2")) // if the user inputs 2 (cube a number)
            {
                // option 2 selected message
                System.out.println("");
                System.out.println("--- OPTION 2 ---");
                System.out.println("You have chosen to cube a number.");
                System.out.println("please input the number you will be cubing."); // requests number input

                userValueBase = keyedInput.nextDouble(); // gets the user's number chosen
                userValueMultiplied = userValueBase; // copies base onto multiplied
                
                exponentMultiplier = 3; // initializes exponent multiplier
                
                // output message
                System.out.println("");
                System.out.println("So you have chosen to square " + userValueBase + ".");
                System.out.println("The equation looks like this " + userValueBase + "^" + exponentMultiplier + ".");                
                
                //the actual exponent machine
                for (exponentMultiplier = exponentMultiplier; exponentMultiplier > 1 ; exponentMultiplier = exponentMultiplier - 1) // since exponent multiplier was initialised earlier, it can refrence itself here, and will run until exponent hits 1. (exponent of 1 does nothing)
                {
                    userValueMultiplied = userValueMultiplied * userValueBase; // multiplies product by value - acts like exponent
                }
                
                // this message displays the answer
                System.out.println("so the final answer is " + userValueMultiplied + ".");
                
                // instructions on returning
                System.out.println("Enter any key to return to Main Menu."); 
                
                // these few lines dont actually keep track of the user's input. instead, they keep console cleaner, by requiring an input to return to the menu. they also reset the optionChosen input value
                optionChosen = keyedInput.nextLine();
                optionChosen = keyedInput.nextLine();
                System.out.println("Returning to Main Menu...");
            }
            
            else if (optionChosen.equals("3")) // if the user inputs 3 (Number to the X power)
            {
                // option 2 selected message
                System.out.println("");
                System.out.println("--- OPTION 3 ---");
                System.out.println("You have chosen to multiply a number by an exponent of your choice.");
                System.out.println("First, please input the number you will be using."); // requests number input

                userValueBase = keyedInput.nextDouble(); // gets the user's number chosen
                userValueMultiplied = userValueBase; // copies base onto multiplied
                
                // requesting and getting the exponent
                System.out.println("");
                System.out.println("Next, please input the power/exponent you will be using."); // requests exponent
                exponentMultiplier = keyedInput.nextInt(); //gets exponent
                
                
                // if is used here incase the user decides to enter positive, negative, or a 0
                if (exponentMultiplier > 0) // if the exponent is positive and non zero (basically just a ctrl c + ctrl v of the cube and square sections)
                {
                    // output message
                    System.out.println("");
                    System.out.println("Your equation looks like this " + userValueBase + "^" + exponentMultiplier + ".");  
                    System.out.println("It is " + userValueBase + " to the power of " + exponentMultiplier + ".");
                    System.out.println("or " + userValueBase + " multiplied by itself " + exponentMultiplier + " times.");

                    //the actual exponent machine
                    for (exponentMultiplier = exponentMultiplier; exponentMultiplier > 1 ; exponentMultiplier = exponentMultiplier - 1) // since exponent multiplier was initialised earlier, it can refrence itself here, and will run until exponent hits 1. (exponent of 1 does nothing)
                    {
                        userValueMultiplied = userValueMultiplied * userValueBase; // multiplies product by value - acts like exponent
                    }

                    // this message displays the answer
                    System.out.println("so the final answer is " + userValueMultiplied + ".");
                    
                    // instructions on returning
                    System.out.println("Enter any key to return to Main Menu."); 

                    // these few lines dont actually keep track of the user's input. instead, they keep console cleaner, by requiring an input to return to the menu. they also reset the optionChosen input value
                    optionChosen = keyedInput.nextLine();
                    optionChosen = keyedInput.nextLine();
                    System.out.println("Returning to Main Menu...");
                }
                else if (exponentMultiplier < 0) // if the exponent is negative and non zero(Note: negative exponents = 1 divided by the positive counterpart!, so 6^-2 = 1 / 6^2 or 1 / 36)
                {
                    // output message
                    System.out.println("");
                    // message explaining negative exponents
                    System.out.println("The equation looks like this " + userValueBase + "^" + exponentMultiplier + ".");
                    System.out.println("because exponent is negative, the result will be 1 / the positive exponential product");

                    //the actual exponent machine
                    for (exponentMultiplier = exponentMultiplier; exponentMultiplier < -1 ; exponentMultiplier = exponentMultiplier + 1) // since exponent multiplier was initialised earlier, it can refrence itself here
                    //  (inverse of previous exponent looping machines, because initial exponent is negative. Will also stop at -1, because -1 means divide by base number)
                    {
                        userValueMultiplied = userValueMultiplied * userValueBase; // multiplies product by value - acts like exponent
                    }
                    
                    // last chunk divides 1 by it
                    userValueMultiplied = 1 / userValueMultiplied;

                    // this message displays the answer
                    System.out.println("so the final answer is " + userValueMultiplied + ".");
                    
                    // instructions on returning
                    System.out.println("Enter any key to return to Main Menu."); 

                    // these few lines dont actually keep track of the user's input. instead, they keep console cleaner, by requiring an input to return to the menu. they also reset the optionChosen input value
                    optionChosen = keyedInput.nextLine();
                    optionChosen = keyedInput.nextLine();
                    System.out.println("Returning to Main Menu...");
                }
                else // if none of the above are true (IE, exponent entered was 0)
                {
                    // ouput the message
                    System.out.println("");
                    System.out.println("You have entered a 0.");
                    System.out.println("The equation looks like this " + userValueBase + "^" + exponentMultiplier);
                    System.out.println("However, anything to the power of 0 is automatically 1.");
                    
                    // this message displays answer
                    System.out.println("Therefore, the answer is 1.");
                    
                    // instructions on returning
                    System.out.println("Enter any key to return to Main Menu."); 

                    // these few lines dont actually keep track of the user's input. instead, they keep console cleaner, by requiring an input to return to the menu. they also reset the optionChosen input value
                    optionChosen = keyedInput.nextLine();
                    optionChosen = keyedInput.nextLine();
                    System.out.println("Returning to Main Menu...");
                }   
            }
            else // if the user inputs anything else (end the program)
            {
                runProgram = false; // sets runProgram as false, effectively stopping the loop and ending the program
                // end message here
                System.out.println("");
                System.out.println("--- END PROGRAM ---");
                System.out.println("So you have decided to end the program.");
                System.out.println("");
                System.out.println("Bye lol!");
            }                           
        }
    }    
}
