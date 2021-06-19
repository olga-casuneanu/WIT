import java.util.Scanner;

public class GasCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;

        do {
            System.out.println("Enter miles");
            int miles = input.nextInt();
            System.out.println("Enter gallons used");
            int gallons = input.nextInt();
            float mpg = miles / gallons;
            System.out.println("Average MPG per this trip = " + mpg);
            System.out.println("-----------------------------------------");
            totalMiles += miles;
            System.out.println("Total miles = " + totalMiles);
            totalGallons += gallons;
            System.out.println("Total gallons used = " + totalGallons);
            float totalMpg = totalMiles / totalGallons;
            System.out.println("Total average MPG = " + totalMpg);
            System.out.println("If you want to quit enter -1");
        } while (input.nextInt() != -1);

    }
}
