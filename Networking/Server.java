package com.mphasis.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//server code performing write operation 

public class Server {
    public static void main(String[] args) {
        ServerSocket server;
        try{
            server = new ServerSocket(7548);
            while(true){
                Socket client = server.accept();
                OutputStream os= client.getOutputStream();
                BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(os));
                bw.write("Hello");
                bw.flush();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
