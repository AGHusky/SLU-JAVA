/*
Name: Christian Nyl M. Pulmano
* Programming Date: September 21,2023
* Activity Name and Number: Prelim Exercise Number 9

Analysis:
Input: 10 pairs of grades and units
Processes:
Read the grades and units
Compute the sum of the products of grades and units
Compute the total of the units
Compute the average : (sum of products of grades and units)/total_units
Show the average
Give an appropriate message
Output: Average, Message
Algorithm:
1. Let grade represent a grade for a subject
2. Let units represent number of units for a subject
3. Let totalGrade = 0 where totalGrade represents the sum of the products of grades and
corresponding units
4. Let totalUnits = 0 where totalUnits represents the total number of units
5. Let average represent the average grade of the student
6. Read the first grade
7. Read the number of units for the first grade
8. Add the product of first grade and the corresponding units to totalGrade
9. Add the units for the first grade to totalUnits
10. Repeat steps 6, 7, 8 and 9 for the 2nd to the 10th grade
11. Compute the average where average = totalGrades/totalUnits
12. Display the average
13. If (average >= 85) print “Congratulations! You belong to the dean's list."
14. If (average < 85) print “Sorry! You did not make it to the dean's list. Do better
next term."
*/
package Exercises.prelims;
import java.lang.*;
import java.util.Scanner;
public class GradeAverage1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int grade = 50;
        int units = 0;
        int totalGrade = 0;
        int totalUnits = 0;
        double average = 0.0;

        System.out.print("Enter the grade of the student for the 1st subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 1st subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;
        totalUnits = totalUnits + units;

        System.out.print("Enter the grade of the student for the 2nd subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 2nd subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;
// continue code below...

        System.out.print("Enter the grade of the student for the 3rd subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 3rd subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;


        System.out.print("Enter the grade of the student for the 4th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 4th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;

        System.out.print("Enter the grade of the student for the 5th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 5th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;

        System.out.print("Enter the grade of the student for the 6th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 6th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;

        System.out.print("Enter the grade of the student for the 7th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 7th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;

        System.out.print("Enter the grade of the student for the 8th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 8th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;

        System.out.print("Enter the grade of the student for the 9th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 9th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;

        System.out.print("Enter the grade of the student for the 10th subject: ");
        grade = Integer.parseInt(kbd.nextLine());

        System.out.print("Enter the number of units for the 10th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;
        totalUnits = totalUnits + units;

        average = (double) totalGrade/totalUnits;

        System.out.println(totalGrade +"  "+ totalUnits);

        System.out.println("Your Average Grade = "+average);
        if(average >= 85){
            System.out.println("Congratulations! You belong to the dean's list. ");
        }
        else{
            System.out.println("Sorry! You did not make it to the dean's list. Do better next term");
        }
        System.out.println();
    } // end of main
} // end of class
