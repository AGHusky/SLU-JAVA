/*
* Name: Christian Nyl M. Pulmano
* Programming Date: September 25,2023
* Activity Name and Number: Quiz 1
-----------------------------------------------------------------
Input: 3 numbers
Processes: Get the sum, product, quotient, average, square
Display results
Output: Sum, integer quotient, Actual quotient, product,integer quotient, exact integer quotient
Average, squared n1, squared n2, squared n3
------------------------------------------------------------------
Algorithm:
* 1. Gets 3 nuber user input
* 2. Display the 3 user input
* 3. get the sum of the 3 input
* 4. Divide the first and second number
* 5. get the product of n1 n2 n3
* 6. get the sum of n1 and n2 then divide by 3 display integer quotient
* 7. get the sum of n1 and n2 then divide by 3 display the exact quotient
* 8. get the average
* 9. get square of n1 n2 and n3

 -------------------------------------------------------------------
*/
package Quizzes.prelims;
import java.util.*;
import java.lang.*;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
// get keyboard input for three integers
        System.out.print("First Number: ");
        int n1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Second Number: ");
        int n2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Third Number: ");
        int n3 = Integer.parseInt(keyboard.nextLine());

// display the three numbers
        System.out.println ("You entered the numbers: " + n1 + ", " + n2 + " and " + n3);

// add the three numbers and store it in another int variable named sum
        int sum = n1 + n2 + n3;

// display the sum
        System.out.println("\nThe sum of the three numbers is " + sum);

// divide the first number by the second and display the value

        int q1 = n1 / n2;
        System.out.println("\nThe expression used computed the integer quotient: " + q1);

        double q2 = (double) n1 / n2;
        System.out.println("\nThe expression used computed the actual quotient: " + q2);

/* #1. Compute the product of the three numbers, store it in another integer
variable and display this value. INSERT THE CODES BELOW... */

        int product = n1 * n2 * n3;
        System.out.println("\nThe product of the three numbers is: " + product);

/* #2. Get the sum of the first two numbers and divide it by the third number,
compute only for the integer quotient and display the value.
INSERT THE CODES BELOW... */

        int quotient = n1 + n2;
        quotient = quotient / n3;
        System.out.println("\nInteger quotient: "+quotient);

/* #3. Get the sum of the first two numbers and divide it by the third number,
compute for the exact quotient and display the value.
INSERT THE CODES BELOW... */

        double Quotient = n1 + n2;
        Quotient = Quotient / n3;
        System.out.println("\nInteger quotient: "+ Quotient);

/* #4. Compute the average of the three numbers and display the result with 2
decimal values shown. INSERT CODE BELOW... */

        Double Average = (double) (n1 + n2 + n3) / 3;
        System.out.printf("\nAverage: %.2f\n", Average );

/* #5. Compute the square of each number and display the results.
INSERT CODE BELOW... */
        int N1 = n1 * n1;
        int N2 = n2 * n2;
        int N3 = n3 * n3;

        System.out.println("The squared of n1^2: "+ N1);
        System.out.println("The squared of n2^2: "+ N2);
        System.out.println("The squared of n3^2: "+ N3);
        System.exit(0);
    } // End of the main method
} // End of class Quiz1
