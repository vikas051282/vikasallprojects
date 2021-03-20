package com.company;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

//class with main() performing exception handling

public class ClientApplication {
    public static void main(String[] args) {
    try{
        AuthenticationRemote remote=(AuthenticationRemote) Naming.lookup("rmi://localhost/RemoteAuthentication");
        System.out.println(remote.loginValidation("Arfath", "pas"));

    }
    catch (NotBoundException e){
        e.printStackTrace();

    }
    catch (MalformedURLException e){
        e.printStackTrace();
    }
    catch (RemoteException e){
        e.printStackTrace();
    }
    }
}
