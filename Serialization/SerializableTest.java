package com.company;

import java.io.*;

//class performing Serialization

class Data implements Serializable{
    private static final long SerialVersionUID = 10l;
    int i=10;
    int j=20;
    int k=30;
}

//Main class performing IO operations

public class SerializableTest{

    public static void main(String[] args) {
Data data= new Data();
try{
    FileOutputStream fos = new FileOutputStream("xyz.txt");
    ObjectOutputStream oos= new ObjectOutputStream(fos);
    oos.writeObject(data);
    FileInputStream fis = new FileInputStream("xyz.txt");
    ObjectInputStream ois= new ObjectInputStream(fis);
    Data dataRestored= (Data)ois.readObject();
    System.out.println("deserialized object value :" + dataRestored.i +".." + dataRestored.j);
}
catch (IOException e){
    e.printStackTrace();
}
catch (ClassNotFoundException cnfe){
    cnfe.printStackTrace();
}
    }
}
