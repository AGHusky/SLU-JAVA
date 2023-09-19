/*
* Name: Christian Nyl M. Pulmano
* Programming Date: August 31,2023
* Activity Name and Number: Dispenser
-----------------------------------------------------------------
Input: How much will you withdraw
Processes: Receipt of Withdraw
 Compute the Total amount and quantity dispensed
 Display results
Output: Peso bill, Quantity Dispensed, Amount
------------------------------------------------------------------
Algorithm:
* 1. Create variables.
* 2. get the modulo for the next
* 3. divide to get dispensed
* 4. Multiply to the get the amount
* 5. reapeat until to hundred
* 6. print out result
* 7. out
 -------------------------------------------------------------------
*/

package Exercises.prelims;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Dispenser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int withdraw = 0;

        System.out.println("Enter the amount to be withdrawn, Whole numbers only: ");
        withdraw = input.nextInt();

        int fhundred = withdraw % 1000;
        int thousand = withdraw / 1000;
        int Athousand = thousand * 1000;

        int ohundred = fhundred % 500;
        int Fivehundred = fhundred / 500;
        int AFHundred = Fivehundred * 500;

        int onehundred = ohundred / 100;
        int AOhundred = onehundred * 100;

        int total_bills = thousand + Fivehundred + onehundred;
        int total_amount = AOhundred + AFHundred + Athousand;

        System.out.println("PESO BILLS          QUANTITY DISPENSED      AMOUNT");
        System.out.println("--------------------------------------------------");
        System.out.println("P1000                        "+ thousand+ "               "+ Athousand);
        System.out.println("P500                         " +Fivehundred+"                "+ AFHundred);
        System.out.println("P100                         " +onehundred+"                "+ AOhundred);
        System.out.println("----------------------------------------------------");
        System.out.println("Total no. of bills           "+ total_bills+"               " + total_amount);
    System.exit(0);
    }
}
