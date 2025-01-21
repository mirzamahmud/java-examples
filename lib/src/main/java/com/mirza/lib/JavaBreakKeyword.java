package com.mirza.lib;

public class JavaBreakKeyword {

    void exapleOfBreakKeyword(){
        System.out.println("====================================== Break Keyword ======================================");
        for(int i = 0; i < 10; i++){
            if(i == 5){
                break;
            }
            System.out.println("Index: " + i);
        }
    }
}
