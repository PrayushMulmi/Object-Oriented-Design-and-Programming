package Task4.rmi;
import java.rmi.Naming;
public class MultiServiceClient {
    public static void main(String[] args) {
        try {
            MultiService obj =
                (MultiService) Naming.lookup("rmi://localhost/MultiService");

            System.out.println(obj.sayHello());
            System.out.println("Square: " + obj.square(6));
            System.out.println("Server Name: " + obj.getServerName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

