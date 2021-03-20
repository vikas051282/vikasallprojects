package com.mphasis.main;

import java.io.*;
import java.net.Socket;

//client code

public class Client {
    public static void main(String[] args) {
        try{

           //create socket object

           Socket server =  new Socket("localhost", 7548 );
            InputStream is = server.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            System.out.println(br.readLine());
            br.close();
            server.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
