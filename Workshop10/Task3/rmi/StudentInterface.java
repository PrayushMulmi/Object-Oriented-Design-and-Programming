package Task3.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentInterface extends Remote {
    String getStudentInfo(int id) throws RemoteException;
}

