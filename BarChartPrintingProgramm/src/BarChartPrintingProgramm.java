import java.util.Scanner;

public class BarChartPrintingProgramm {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = readFromKeyboard();
        int n2 = readFromKeyboard();
        int n3 = readFromKeyboard();
        int n4 = readFromKeyboard();
        int n5 = readFromKeyboard();
        printNStars(n1);
        printNStars(n2);
        printNStars(n3);
        printNStars(n4);
        printNStars(n5);
    }

    static int readFromKeyboard(){
        int r = -1;
        do {
            System.out.println("Please input a number from 1 to 30");
            r = sc.nextInt();
        } while (r < 1 || r > 30);
        return r;
    }

    static void printNStars(int n){
        String s = "";
        for (int i = 0; i < n; i++){
            s += "*";
        }
        System.out.println(s);
    }

}
