package Task1.rmi;

import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;

public class DateTimeServer extends UnicastRemoteObject implements DateTimeInterface {

    protected DateTimeServer() throws Exception {}

    public String getDateTime() {
        return LocalDateTime.now().toString();
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://localhost/DateTimeService", new DateTimeServer());
            System.out.println("DateTime Server Running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

