package SingleThreaded;

import java.io.IOError;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() {
       int port = 8010;
       ServerSocket socket = new ServerSocket(port);
       socket.setSoTimeout(10000);
         while(true) {
            try {
                System.err.println("Server is listening on port " + port);
                Socket acceptedConnection = socket.accept();
                System.err.println("connectioin accepted from " + acceptedConnection.getRemoteSocketAddress());
            } catch (IOException ex) {
               ex.printStackTrace();    
            }

         }
    }

    public static void main(String[] args) {
        System.out.println("Server started");
    }
}
 