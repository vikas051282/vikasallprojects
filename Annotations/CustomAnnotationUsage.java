package com.company.annotations;

import com.company.annotations.CustomAnnotation;
@CustomAnnotation(name="Class" ,duration=2,version={1.0,1.5,2.0} )

//class CustomAnnotationUsage with fields and method

public class CustomAnnotationUsage {
    //@CustomAnnotation(name="Field" ,duration=1,version={1.5,2.0} )
    int field;
    //@CustomAnnotation(name="Constructor" ,duration=1,version={1.0,1.5,2.0} )
    public CustomAnnotationUsage(){

    }
@Deprecated
public void test(int num){
        int ivar;
}
//    @CustomAnnotation(name="Method" ,duration=1,version={1.0,1.5,2.0} )
//    public void test(@CustomAnnotation(name="class", duration  =2,version  ={1.0,1.5,2.0}) int num){
//        @CustomAnnotation(name="class" ,duration=1,version={1.0,1.5,2.0} )
//        int ivar;
//    }


}
