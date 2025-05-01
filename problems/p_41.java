package problems;

import java.util.Scanner;

public class p_41 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;

        System.out.println("Please enter a sequence of positive numbers");

        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            sum += num;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The maximum number is: " + max);
            System.out.println("The minimum number is: " + min);
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No valid input was entered.");
        }
    }
}
