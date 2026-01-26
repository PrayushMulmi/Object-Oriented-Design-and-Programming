package Task4.rmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MultiServiceImpl extends UnicastRemoteObject
        implements MultiService {

    protected MultiServiceImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from RMI Server!";
    }

    public int square(int n) {
        return n * n;
    }

    public String getServerName() {
        return "Main RMI Server";
    }
}

