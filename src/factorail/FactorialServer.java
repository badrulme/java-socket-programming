package factorail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Waiting For Client...");
        ServerSocket serverSocket = new ServerSocket(8989);
        Socket socket = serverSocket.accept();
        System.out.println("Connection Established.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int n = Integer.parseInt(bufferedReader.readLine());
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println("Factorial of " + n + " is: " + calFact(n));
    }

    static int calFact(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * calFact(n - 1);
        }
    }
}
