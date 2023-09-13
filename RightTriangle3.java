/*
* Name: Christian Nyl M. Pulmano
* Programming Date: August 31,2023
* Activity Name and Number: Prelim Exercise Number 2
-----------------------------------------------------------------
Input: area of rectangle
Processes: Compute the perimeter of the Right Triangle
 Compute the area of the Right Triangle
 Display results
Output: perimeter, area
------------------------------------------------------------------
Algorithm:
* 1. create variables for the input of the user
* 2. get input from the user
* 3. create a formula to get the perimeter
* 4. create a formula to get te area
* 5. return the perimeter
* 6. return the area
 -------------------------------------------------------------------
*/

package Exercises.prelims;

import java.util.Scanner;

public class RightTriangle3 {
    public static void main(String[] args) {
        int base;
        int height;
        int hypothenues;

        Scanner Base = new Scanner(System.in);
        System.out.println("Enter the base of the Right Triangle: ");
        base = Integer.parseInt(Base.nextLine());

        Scanner Height = new Scanner(System.in);
        System.out.println("Enter the height of the Right Triangle: ");
        height = Integer.parseInt(Height.nextLine());

        Scanner Hypothenues = new Scanner(System.in);
        System.out.println("Enter the Hypothenues of the Right Triangle: ");
        hypothenues = Integer.parseInt(Hypothenues.nextLine());

        int R_Triangle = base * height * hypothenues;
        double perimeter;
        perimeter = 0.5 * base * height;


        // Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" * perimeter of rectangle is " + R_Triangle + "                           *");
        System.out.println(" * Area of rectangle is " + perimeter +"                              *");
        System.out.println(" *                                                         *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");



    }
}
