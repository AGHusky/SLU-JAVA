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
1. Assign the base
2. Assign the height
3. Assign the hypothenues
3. Compute the perimeter base * height * hypothenues
4. Compute the area: (1/2) * base * height
5. show perimeter
6. show area
 -------------------------------------------------------------------
*/

package Exercises.prelims;

public class RightTriangle {
    public static void main(String[] args) {
        int base = 3;
        int height = 4;
        int hypothenues = 5;

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
        System.out.println(" * perimeter of rectangle is " + R_Triangle + "                         *");
        System.out.println(" * Area of rectangle is " + perimeter +"                              *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");



    }
}
