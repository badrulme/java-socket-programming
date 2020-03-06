package factorail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Client Started...");
            Socket socket = new Socket("localhost", 8989);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the value");
            int n = Integer.parseInt(bufferedReader.readLine());
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println(n);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
