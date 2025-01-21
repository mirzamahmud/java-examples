package com.mirza.lib;

import java.util.Scanner;

public class JavaConditionalStatement {
    int imaginaryNumber;
    JavaConditionalStatement(int number){
        this.imaginaryNumber = number;
    }
    void exampleOfConditionalStatement(){
        System.out.println("=============================== Conditional Statement =====================================");
        // ============================================ create scanner object =========================================
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int imaginaryNumber = scanner.nextInt(); // ==================== read data from user ==========================
        // ============================================ write a conditional statement =================================
        if(imaginaryNumber == 0){
            System.out.println("This number is zero (0)");
        } else if (imaginaryNumber > 0) {
            System.out.println("This number is positive (+)");
        } else {
            System.out.println("This number is negative (-)");
        }
    }
}
