package Task3.rmi;

import java.rmi.Naming;
import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        try {
            StudentInterface obj =
                (StudentInterface) Naming.lookup("rmi://localhost/StudentService");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            System.out.println("Student Info: " + obj.getStudentInfo(id));
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

