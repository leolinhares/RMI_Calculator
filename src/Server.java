import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by leolinhares on 10/09/2016.
 */
public class Server extends UnicastRemoteObject implements ServerInterface {

    public Server() throws RemoteException {
        System.out.println("Server initialized");
    }

    @Override
    public double sum(double a, double b) throws RemoteException {
        return a+b;
    }

    @Override
    public double minus(double a, double b) throws RemoteException {
        return a-b;
    }

    @Override
    public double times(double a, double b) throws RemoteException {
        return a*b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        return a/b;
    }
}
