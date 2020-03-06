package EchoTest;

import java.io.IOException;
import java.net.Socket;

public class EchoClient2 {
    public static void main(String[] args) throws IOException {
        System.out.println("I am client 2");
        Socket socket = new Socket("localhost", 8989);

    }
}
