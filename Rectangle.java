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
1. Assign the length of rectangle
2. Assign the height of rectangle
3. Compute the perimeter : 2 * length + 2 * width
4. Compute the area: area = length * width
5. show perimeter
6. show area
 -------------------------------------------------------------------
*/
package Exercises.prelims;

public class Rectangle {
    public static void main(String[] args) {

        int length;
        int width;
        double perimeter;
        double areaOfRectangle;
        length = 10; //assign the length
        width = 5;
        perimeter = 2 * length + 2 * width; // assign the width
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

