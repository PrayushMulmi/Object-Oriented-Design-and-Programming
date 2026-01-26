package Task4.rmi;

import java.rmi.Naming;

public class MultiServiceServer {
    public static void main(String[] args) {
        try {
            MultiService service = new MultiServiceImpl();
            Naming.rebind("MultiService", service);
            System.out.println("MultiService Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
