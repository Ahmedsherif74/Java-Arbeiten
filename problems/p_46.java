package problems;

import java.util.Scanner;

public class p_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Please enter a number");
            num = scanner.nextInt();

            if (num == -1) {
                System.out.println("Thank you");
                break;
            }

            int count = 0;

            if (num == 0) {
                count = 1;
            } else {
                while (num > 0) {
                    num /= 10;
                    count++;
                }
            }

            System.out.println("Number of digits in " + num + " = " + count);
        }
    }
}
