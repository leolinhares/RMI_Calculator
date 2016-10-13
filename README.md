# RMI_Calculator
RMI Implementation of a calculator

How to execute the source code:

1. Go to the folder src
2. Start the registry using: `rmiregistry &`
3. Compile all the java files: `javac *.java`
3. Start the server: `java Server`
4. Start the client: `java Client`

If there's a registry error, try killing the process using `lsof -i :1099` to check the PID_number and then `kill -9 PID_number`
