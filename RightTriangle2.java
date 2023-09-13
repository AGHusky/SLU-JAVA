/*
Name: Christian Nyl M. Pulmano
programming date: September 4, 2023
Activity Name & number: Prelim exercise Number 3

Problem:
Write a program for determining the hypotenuse of a
right triangle with a given base and height. Name the
class as RightTriangle2. Show the appropriate algorithm.

Algorithm:
    1. Assign a & b as the base & height
    2. square a and b
    3. add the squared of a and b
    3. compute the square root of a&b
    4. show the hypotenuse.

 */

import java.lang.*;
public class RightTriangle2 {
    public static void main(String[] args) {
        double a; //this will serve as the base
        double b; //this will serve as the height
        double c; //this will serve as the hypotenuse
        double raw_c;
        a = 3;
        b = 4;

        a = a * a;
        b = b * b;
        raw_c = a + b;
        c = Math.sqrt(a + b);

        System.out.println("***********************************************************");
        System.out.println("*      a^2 + b^2 = " + raw_c + "                                   *");
        System.out.println("*      the hypothenuse of the Right triangle is " + c + "       *");
        System.out.println("***********************************************************");


    }
}
