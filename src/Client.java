import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by leolinhares on 10/09/2016.
 */
public class Client {
    private  Client(){

    }

    public static void main(String[] args) {
        String host;

        if (args.length < 1){
            host = null;
        }else{
            host = args[0];
        }

        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Server stub = (Server) registry.lookup("ServerInterface");
            Double response = stub.sum(2,3);

            System.out.println("Sum: " + response);
        }catch (Exception e){

        }
    }
}