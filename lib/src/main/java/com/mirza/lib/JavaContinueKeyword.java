package com.mirza.lib;

public class JavaContinueKeyword {
    void exampleOfContinueKeyword(){
        System.out.println("============================== Continue Keyword ============================");
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println("index: " + i);
        }
    }
}
