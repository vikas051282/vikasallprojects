package com.company;

import com.company.organs.Eye;
//class having fields leftEye && rightEye

public class Human {
    public HumanEye leftEye,rightEye;

    public Human(){
        leftEye=new HumanEye();
        rightEye= new HumanEye();

    }
    public class HumanEye extends Eye{

    }
}
