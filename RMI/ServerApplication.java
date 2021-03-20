package com.company;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

//Main class performing exception handling

public class ServerApplication {

    public static void main(String[] args) {
	AuthenticationRemoteImpl authenticationRemote =null;
	try {
        authenticationRemote= new AuthenticationRemoteImpl();
        Naming.rebind("rmi:///RemoteAuthentication", authenticationRemote);
        System.out.println("Remote object registered..");
    }
	catch (MalformedURLException | RemoteException e){
	    e.printStackTrace();
    }
    }
}
