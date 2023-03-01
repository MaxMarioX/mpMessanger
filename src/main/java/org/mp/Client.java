package org.mp;

import java.net.*;
import java.io.*;

public class Client {

   // private static final int PORT_TCP = 62231;

    private Socket clientSocket;
    private PrintWriter output;
    private BufferedReader input;

    public void start(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            output = new PrintWriter(clientSocket.getOutputStream(), true);
            input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String send(String message) {
        try {
            output.println(message);
            return input.readLine();
        } catch (Exception e) {
            return "Oops! Something went wrong when sending message! :(";
        }
    }

    public void stop() {
        try {
            input.close();
            output.close();
            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Oops! Something went wrong when closing connection! :(");
        }
    }

    public void logSend(String message) {
        System.out.println("[Send]: "+message);
    }

    public void logReceive(String message) {
        System.out.println("[Receive]: "+message);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start("127.0.0.1", 62231);
        String a = client.send("Hi!");
        client.logReceive(a);
        client.stop();
    }

}
