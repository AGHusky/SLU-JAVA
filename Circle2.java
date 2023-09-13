/*
Name: Christian nyl M. Pulmano
Programming date: September 4, 2023
 Activity name and number: Prelim Exercise Number 3

 problem:
 write a program that will show the radius of a circle with a given area.
 Analysis:
    input: area of a circle (area)
    processes: Compute the radius of the circle
            Display the data associated with the circle
    output: Radius

Algorithm:
    1. Assign the area of the circle
    2. Compute the radius: Radius = square root of (area/PI)
    3. show given area of a circle
    4. show the computed radius of the circle with a given area

 */

import java.lang.*;
public class Circle2 {
    public static void main(String[] args) {
        double radius;
        double area;
        area = 100.0;
        radius = Math.sqrt(area / Math.PI);

        System.out.println();
        System.out.println();
        System.out.println("***********************************************************");
        System.out.println("*     Given area of circle = " + area + "                       *");
        System.out.println("*     Computed radius of the circle = " + radius + "  *");
        System.out.println("***********************************************************");
    }
}
