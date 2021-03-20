package com.company;

import com.company.annotations.CustomAnnotationUsage;

//Main class CustomAnnotationMain

public class CustomAnnotationMain {

    public static void main(String[] args) {
        //creating object for CustomAnnotationUsage 
        CustomAnnotationUsage cau= new CustomAnnotationUsage();
        cau.test(4);
    }
}
