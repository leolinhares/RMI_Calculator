import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by leolinhares on 10/09/2016.
 */
public class Server implements ServerInterface {

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

    public static void main(String[] args) {
        try{
            Server server = new Server();
            ServerInterface stub = (ServerInterface) UnicastRemoteObject.exportObject(server,0);

            //Binding
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("ServerInterface", stub);

            System.out.println("Server ready");
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
            e.printStackTrace();
        }

    }
}
