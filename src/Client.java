import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 * Created by leolinhares on 10/09/2016.
 */
public class Client {
    private  Client(){

    }

    public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];

        try {
	
			double num1;
			double num2;
			int option = 5;
						
			Scanner input_num = new Scanner(System.in);
						    
			System.out.println("First number: ");  
			num1 = input_num.nextDouble();  
			System.out.println("Second number: ");  
			num2 = input_num.nextDouble();
							
            Registry registry = LocateRegistry.getRegistry(host);
            ServerInterface stub = (ServerInterface)registry.lookup("ServerInterface");

            Double response = stub.sum(num1,num2);
            Double response1 = stub.minus(num1,num2);
            Double response2 = stub.times(num1,num2);
            Double response3 = stub.divide(num1,num2);

//            Double response = stub.sum(2,3);
//            Double response1 = stub.minus(2,3);
//            Double response2 = stub.times(2,3);
//            Double response3 = stub.divide(2,3);

//            System.out.println("Sum: " + response);
//            System.out.println("Minus: " + response1);
//            System.out.println("Times: " + response2);
//            System.out.println("Divide: " + response3);

			Scanner input_op = new Scanner(System.in);
			
			System.out.println("Enter option: ");  
	        System.out.println("1. (+)");    
	        System.out.println("2. (-)");    
	        System.out.println("3. (x)");    
	        System.out.println("4. (/)");    
	        System.out.println("0. Exit");
	   		option = input_op.nextInt();  
	
	        while (option != 0) {
		
				if ( option == 1 ) {
					System.out.println("Sum: " + response);
	                break;  
	            }  
	            else if (option == 2) { 
					System.out.println("Minus: " + response1);
					break;  
				}  
				else if (option == 3) {
					System.out.println("Times: " + response2);
					break;  
				}  
				else if (option == 4) {  
					System.out.println("Divide: " + response3);
					break;  
				}  
				else{  
					System.out.println("Exit!");  
					break;  
				}      
	        }


        }catch (Exception e){
			
			System.err.println("Client exception: " + e.toString());
			            e.printStackTrace();

        }
    }
}
