package problems;

import java.util.Scanner;

public class p_410 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String firstInput = scanner.nextLine();
            String secondInput = scanner.nextLine();

            System.out.println(secondInput.contains(firstInput));

            scanner.close();
        }
    }

