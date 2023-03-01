package org.mp;

import java.net.*;
import java.io.*;

public class Server {

   // private static final String SERVER_IP = "127.0.0.1";
   // private static final int PORT_TCP = 62231;

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter output;
    private BufferedReader input;

    public void start(int portTCP) {
            try {
                serverSocket = new ServerSocket(portTCP);
                clientSocket = serverSocket.accept();
                output = new PrintWriter(clientSocket.getOutputStream(), true);
                input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String inputLine;
                while ((inputLine = input.readLine()) != null) {
                    if (inputLine.equals("bye")) {
                        output.println("bye");
                        break;
                    }
                    output.println(inputLine);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public void stop() {
        try {
            input.close();
            output.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void logSend(String message) {
        System.out.println("[Send]: "+message);
    }

    public void logReceive(String message) {
        System.out.println("[Receive]: "+message);
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start(62231);
        server.stop();
    }
}
