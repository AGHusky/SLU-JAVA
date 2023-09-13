/*
* Name: Christian Nyl M. Pulmano
* Programming Date: August 31,2023
* Activity Name and Number: Prelim Exercise Number 2
-----------------------------------------------------------------
Input: area of rectangle
Processes: Compute the perimeter of the rectangle
 Compute the area of the rectangle
 Display results
Output: perimeter, area
------------------------------------------------------------------
Algorithm:
*1. Create variables
*2. get input from the user
*3. create a formula for the perimeter
*4. Create a formula for the area
*5. return the perimeter
*6. return the area
 -------------------------------------------------------------------
*/

package Exercises.prelims;

import java.lang.*;
import java.util.Scanner;

public class Rectangle3 {
    public static void main(String[] args) {

        Scanner lngth = new Scanner(System.in);
        Scanner wdth = new Scanner(System.in);

        int length;
        int width;

        System.out.println("“Enter the length of the rectangle: ");
        length = Integer.parseInt(lngth.nextLine());

        System.out.println("Enter the width of the rectangle: ");
        width = Integer.parseInt(wdth.nextLine());

        //create variables
        double perimeter;
        double areaOfRectangle;
        //formula to get the perimeter
        perimeter = 2 * length + 2 * width; // assign the width
        //formule to get the area
        areaOfRectangle = length * width;

        // Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" * perimeter of rectangle is " + perimeter + "                         *");
        System.out.println(" * Area of rectangle is " + areaOfRectangle +"                              *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");

    } // end of main method
} // end of class

