package Task4.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MultiService extends Remote {
    String sayHello() throws RemoteException;
    int square(int n) throws RemoteException;
    String getServerName() throws RemoteException;
}

