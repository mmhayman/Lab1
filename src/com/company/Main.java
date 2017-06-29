package com.company;



import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Declare variables

        double userLength = 0;
        double userWidth = 0;
        double Area = 0;
        double Perimeter = 0;
        char userText = '-';

        while ((userText != 'n') && (userText != 'N')) {   // while loop to continue until user presses n.
            System.out.print("Enter Length : ");    // Ask user for length
            userLength = scnr.nextDouble();
            System.out.print("Enter Width : ");       // Ask user for width
            userWidth = scnr.nextDouble();

            Area = userLength * userWidth;       // Finding the area

            System.out.println("Area: " + Area);    // Printing the area

            Perimeter = 2 * (userLength + userWidth);    // Finding the perimeter

            System.out.println("Perimeter: " + Perimeter);   // Printing the perimeter



            System.out.println("Continue? (y/n)");          // Asking user if they want to continue
            userText = scnr.next().charAt(0);               // If press n- stops, y - continues

           if ((userText != 'n') && (userText!='N') && (userText != 'y') && (userText != 'Y') ){ // if user didn't do y/n
                System.out.println( "ERROR: Please enter a correct letter");

        }
            System.out.println(" ");

        }

                return;
            }
        }



