import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float itemValue;
        float totalSalesPerWeek = 0.0F;

        do {
            System.out.println("Enter item value or enter 0 to calculate your earnings");
            itemValue = input.nextFloat();
            totalSalesPerWeek += itemValue;
        }
        while (itemValue != 0);
        System.out.println("Your earnings for this week = " + (totalSalesPerWeek * 0.09 + 200) + " $");

    }
}
