package com.company;

//singleton class with private constructor 

class Singleton
{
    // public instance initialized when loading the class
    public static Singleton instance = new Singleton();

    private Singleton()
    {
        // private constructor
    }
}
