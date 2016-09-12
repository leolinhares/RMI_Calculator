import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by leolinhares on 10/09/2016.
 */
public class Client {
    private  Client(){

    }

    public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];

        try {
	
            Registry registry = LocateRegistry.getRegistry(host);
            ServerInterface stub = (ServerInterface)registry.lookup("ServerInterface");
            Double response = stub.sum(2,3);
            Double response1 = stub.minus(2,3);
            Double response2 = stub.times(2,3);
            Double response3 = stub.divide(2,3);

            System.out.println("Sum: " + response);
            System.out.println("Minus: " + response1);
            System.out.println("Times: " + response2);
            System.out.println("Divide: " + response3);

        }catch (Exception e){
			
			System.err.println("Client exception: " + e.toString());
			            e.printStackTrace();

        }
    }
}
