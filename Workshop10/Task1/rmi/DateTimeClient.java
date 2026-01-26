package Task1.rmi;

import java.rmi.Naming;

public class DateTimeClient {
    public static void main(String[] args) {
        try {
            DateTimeInterface obj =
                (DateTimeInterface) Naming.lookup("rmi://localhost/DateTimeService");

            System.out.println("Current Date & Time: " + obj.getDateTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
