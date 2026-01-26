package Task3.rmi;

import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class StudentServer extends UnicastRemoteObject implements StudentInterface {

    HashMap<Integer, String> data = new HashMap<>();

    protected StudentServer() throws Exception {
        data.put(1, "Alice - 85");
        data.put(2, "Bob - 90");
        data.put(3, "Charlie - 78");
    }

    public String getStudentInfo(int id) {
        return data.getOrDefault(id, "Student Not Found");
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://localhost/StudentService", new StudentServer());
            System.out.println("Student Server Running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

