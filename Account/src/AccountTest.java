import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", 17.53);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter withdrawal amount for account1:");

        double withdrawAmount = input.nextDouble();
        System.out.printf("%n withdrawing %.2f from account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        System.out.println("Enter withdrawal amount for account2");
        withdrawAmount = input.nextDouble();
        System.out.printf("%n withdrawing %.2f from account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
    }
}