package com.company;

import com.company.dto.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;

//interface with loginValidation()

public interface AuthenticationRemote extends Remote {

    public Person loginValidation(String username, String password) throws RemoteException ;

}
