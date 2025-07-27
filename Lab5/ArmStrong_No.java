package Lab5;

import java.util.Scanner;
public class ArmStrong_No {
    public static void printArmstrongNumber(int str, int end) {
        System.out.println("Armstrong numbers between " + str + " and " + end + " are:");

        for (int num = str; num <= end; num++) {
            int original = num;
            int sum = 0;

            int temp = original;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = original;
            while (temp > 0) {
                int digit = temp % 10;
                int cube = 1;

                for (int i = 1; i <= digits; i++) {
                    cube *= digit;
                }

                sum += cube;
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int str = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        printArmstrongNumber(str, end);
    }
}

