package EchoTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Waiting for client....");
        ServerSocket serverSocket = new ServerSocket(8989);
        Socket socket = serverSocket.accept();
        System.out.println("Connection Established.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println("Server: I am receiving string " + s);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println("Server says... " + s);
    }
}
