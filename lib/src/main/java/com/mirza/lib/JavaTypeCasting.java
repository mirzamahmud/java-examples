package com.mirza.lib;

public class JavaTypeCasting {
    // type casting is the process to convert one data type to another
    // in java there are two types of type casting -> Implicit and Explicit

    // ====================== implicit type casting =============================
    int numInt = 100;
    double numDouble = numInt; // 10.0

    void displayImplicitTypeCast(){
        System.out.println("====================== Implicit Type Cast =============================");
        System.out.println("Implicit Type Cast: " + numDouble);

    }

    // ====================== explicit type casting (data loss) =============================
    double pi = 3.1416;
    int numPi = (int) pi;

    void displayExplicitTypeCast(){
        System.out.println("============================ Explicit Type Cast ==================================");
        System.out.println("Explicit Type Cast: " + numPi);

    }

    // ===================== type casting between different data types ========================
    int num1 = 10;
    char charA = (char) (num1 + 'A');

    void displayDifferentTypeCasting(){
        System.out.println("============================ Different Type Cast ==================================");
        System.out.println("Different Type Casting: " + charA);

    }
}
