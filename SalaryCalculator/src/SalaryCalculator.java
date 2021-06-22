import java.util.Scanner;

public class SalaryCalculator {
    Scanner input = new Scanner(System.in);
    private String employeeName;
    private float numberHours = 0.0F;
    private float hourlyRate = 0.0F;


    public void calculator() {
        System.out.println("Enter employee's name");
        employeeName = input.nextLine();
        System.out.println("Enter employee's number of hours");
        numberHours = input.nextFloat();
        System.out.println("Enter employee's hourly rate");
        hourlyRate = input.nextFloat();
        if (numberHours <= 40.0)
            System.out.printf("%s's salary = %.2f $", employeeName, numberHours * hourlyRate);
        else
            System.out.printf("%s's salary = %.2f $", employeeName, ((numberHours - 40) * hourlyRate * 1.5) + (40 * hourlyRate));
    }
}

