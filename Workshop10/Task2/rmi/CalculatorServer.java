package Task2.rmi;

import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer extends UnicastRemoteObject implements CalculatorInterface {

    protected CalculatorServer() throws Exception {}

    public double add(double a, double b) { return a + b; }
    public double sub(double a, double b) { return a - b; }
    public double mul(double a, double b) { return a * b; }
    public double div(double a, double b) { return a / b; }

    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://localhost/CalcService", new CalculatorServer());
            System.out.println("Calculator Server Running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
