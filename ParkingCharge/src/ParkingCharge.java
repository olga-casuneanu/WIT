import java.util.Scanner;

public class ParkingCharge {
    Scanner input = new Scanner(System.in);
    public final double minCharge = 2.0;
    public final double addFee = 0.5;
    public final double maxCharge = 10.0;


    public double calculateCharges() {
        double hoursParked;
        double totalCharge = 0;
        double customerCharge;

        System.out.println("Enter parking hours:");
        hoursParked = input.nextDouble();

        while (hoursParked > 0 && hoursParked < 24) {
            customerCharge = calculateCustomer(hoursParked);
            totalCharge += customerCharge;

            System.out.println("Enter parking hours:");
            hoursParked = input.nextDouble();
        }
        System.out.println("The total charge is: " + totalCharge + " $");
        return totalCharge;
    }

    private double calculateCustomer(double hoursParked) {
        double charge = minCharge + hoursParked * addFee;
        if (hoursParked <= 3) {
            System.out.println("Your charge is " + minCharge + " $");
            charge = minCharge;
        } else if (charge >= maxCharge) {
            System.out.println("Your charge is " + maxCharge + " $");
            charge = maxCharge;
        } else {
            System.out.println("Your charge is " + charge + " $");
        }
        return charge;
    }
}
