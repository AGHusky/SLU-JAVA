/*
* Name: Christian Nyl M. Pulmano
* Programming Date: August 31,2023
* Activity Name and Number: Prelim Exercise Number 2
-----------------------------------------------------------------
Input: Radius of a circle (radius)
Processes: Compute the circumference of the circle
 Compute the area of the circle
 Display results
Output: circumference, area
------------------------------------------------------------------
Algorithm:
* 1. Create variables to store input
* 2. Get input from the user
* 3. create a formula for getting the circumference of the square
* 4. create a formula for getting the area of the square
* 5. return the circumference
* 6. return the area
 -------------------------------------------------------------------
*/
package Exercises.prelims;

import java.lang.*;
import java.util.Scanner;
public class Circle3 {
    public static void main (String [] args) {
// Make an object of Scanner that represents the keyboard
        Scanner kbd = new Scanner(System.in);

        int radius; // variable declaration
        double circumference; // variable declaration
        double areaOfCircle; // variable declaration

        // Read the radius. Print a prompt message
        System.out.print("Type the value of radius then press the enter key: ");
// Assigns an integer entered through the keyboard to radius
        radius = Integer.parseInt(kbd.nextLine());
// A mathematical expression represents a value that is assigned to the variable
// circumference
        circumference = 2 * Math.PI * radius;

// A mathematical expression represents a value that is assigned to the variable
// areaOfCircle
        areaOfCircle = Math.PI * radius *radius;

        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * Radius of circle is " + radius +" *");
        System.out.println(" * Circumference of circle is " + circumference + " *");
        System.out.println(" * Area of circle is " + areaOfCircle + " *");
        System.out.println(" **********************************************************");
    } // end of main method
} // end of class
