package Lab5;
import java.util.Scanner;
public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int choice= -1;
        while ( choice == -1){
            System.out.println("Enter basic salary of the Employee:");
            double basicSalary=sc.nextDouble();

            double hra, da;
            if (basicSalary > 15000) {
                hra = 0.20 * basicSalary;
                da = 0.60 * basicSalary;
            } else {
                hra = 3000;
                da = 0.70 * basicSalary;
            }

            double grossSalary= basicSalary+hra+da;
            System.out.println("The gross Salary is:"+grossSalary);

            System.out.println("Enter -1 to continue or any other number to exit:");
            choice= sc.nextInt();
        }
        System.out.println("Exited Succesfully");
    }
}
