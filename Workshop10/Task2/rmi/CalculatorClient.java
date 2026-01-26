package Task2.rmi;

import java.rmi.Naming;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            CalculatorInterface obj =
                (CalculatorInterface) Naming.lookup("rmi://localhost/CalcService");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            System.out.println("Sum: " + obj.add(a, b));
            System.out.println("Difference: " + obj.sub(a, b));
            System.out.println("Product: " + obj.mul(a, b));
            System.out.println("Division: " + obj.div(a, b));
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}