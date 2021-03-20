package com.company;

import com.company.dto.Person;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// class with constructor AuthenticationRemoteImpl()

public class AuthenticationRemoteImpl extends UnicastRemoteObject implements AuthenticationRemote{
    protected AuthenticationRemoteImpl () throws RemoteException{

    }

//@Override loginValidation
    @Override
    public Person loginValidation(String username, String password){
        if(username!= null && password!= null){
            if(username.equals("Arfath") && password.equals("pass")){
                return new Person("Arafath", "Aboobacker");
            }
        }
        return null;
    }

}
