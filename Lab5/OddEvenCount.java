package Lab5;
import java.util.Scanner;
public class OddEvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nTotal Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}
