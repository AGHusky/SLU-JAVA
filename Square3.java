/*
* Name: Christian Nyl M. Pulmano
* Programming Date: August 31,2023
* Activity Name and Number: Prelim Exercise Number 2
-----------------------------------------------------------------
Input: area of square
Processes: Compute the perimeter of the square
 Compute the area of the square
 Display results
Output: perimeter, area
------------------------------------------------------------------
Algorithm:
* 1. create variable to store user input
* 2. get input from user
* 3. create formula for the perimeter
* 4. create formula for the area
* 5. return the perimeter
* 6. return the area
 -------------------------------------------------------------------
*/

package Exercises.prelims;

import java.lang.*;
import java.util.Scanner;


public class Square3 {
    public static void main(String[] args) {

        int side; //declare side
        double perimeter; //declare perimeter
        double areaOfSquare; //declare AOS

        Scanner sd = new Scanner(System.in);
        System.out.println("Please enter the measure of a side of the square: ");
        side = Integer.parseInt(sd.nextLine());

        perimeter = 4 * side;
        areaOfSquare = side * side;

        // Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" **************************************");
        System.out.println(" *                                    *");
        System.out.println(" *                                    *");
        System.out.println(" *                                    *");
        System.out.println(" * perimeter of square is " + perimeter + "        *");
        System.out.println(" * Area of square is " + areaOfSquare +"             *");
        System.out.println(" *                                    *");
        System.out.println(" *                                    *");
        System.out.println(" *                                    *");
        System.out.println(" **************************************");

    } // end of main method
} // end of class

