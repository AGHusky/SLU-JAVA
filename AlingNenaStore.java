package Exercises.prelims;

import java.lang.*;
import java.util.Scanner;

public class AlingNenaStore {
    public static void main(String[] args) {

        double egg = 5.00;
        double milk = 18.75;
        double sardines = 23.50;


        Scanner kbd = new Scanner(System.in);

        System.out.println("Product: ");
        String Product = kbd.nextLine();

        System.out.println("Quantity: ");
        int Quantity = Integer.parseInt(kbd.nextLine());

        System.out.println("Unit price: ");
        double Price = kbd.nextDouble();

        System.out.println("Discount: ");
        double Discount = kbd.nextDouble();

        System.out.println("Cash Tendered: ");
        double Cash = kbd.nextDouble();

        //output
        double TotalPurchaseAmount;
        double TotalDiscount;
        double AmountTobePaid;
        double Change;

        TotalPurchaseAmount = Price * Quantity;
        System.out.println("Total Purchase Amount: " + TotalPurchaseAmount);

        TotalDiscount = Discount / 100 * TotalPurchaseAmount;
        System.out.println("Total Discount: " + TotalDiscount);

        AmountTobePaid = TotalPurchaseAmount - TotalDiscount;
        System.out.println("Amount to be pain: " + AmountTobePaid);

        Change = Cash - AmountTobePaid;
        if (Change < 0){
            System.out.println("not enough money");
            System.exit(0);
        }

        else{
            System.out.println("Change: " + Change);
        }
    }
}