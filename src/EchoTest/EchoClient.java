package EchoTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        System.out.println("Client Started");
        Socket socket = new Socket("localhost", 8989);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = bufferedReader.readLine();
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println(s);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(reader.readLine());
    }
}
