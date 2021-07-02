import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 5;
        int number;
        int largest;
        System.out.println("Enter number");
        largest = input.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.println("Enter number");
            number = input.nextInt();
            if (number > largest)
                largest = number;
        }
        System.out.println("The largest number found so far is " + largest);
    }
}
