import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by leolinhares on 10/09/2016.
 */
public interface ServerInterface extends Remote{
    public double sum(double a, double b) throws RemoteException;
    public double minus(double a, double b) throws RemoteException;
    public double times(double a, double b) throws RemoteException;
    public double divide(double a, double b) throws RemoteException;
}
