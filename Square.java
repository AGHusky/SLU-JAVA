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
1. Assign the length of square
2. Assign the height of square
3. Compute the perimeter of the square : 4 * side
4. Compute the area: area = side  * side
5. show perimeter
6. show area
 -------------------------------------------------------------------
*/

package Exercises.prelims;

public class Square {
    public static void main(String[] args) {
        int side; //declare side
        double perimeter; //declare perimeter
        double areaOfSquare; //declare AOS
        side = 5;
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
