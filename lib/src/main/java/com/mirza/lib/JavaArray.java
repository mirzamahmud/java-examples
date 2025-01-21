package com.mirza.lib;

import java.util.Arrays;

public class JavaArray {
    // basic syntax of array in java: dataType[] arrayName = new dataType[arraySize]
    int[] numberArray;

    void initializeArray(){
        numberArray = new int[10];
    }

    void exapleOfArray(){
        System.out.println("=============================== Array ==================================");
        initializeArray();
        for(int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i + 1;
            System.out.println("numberArray" + "[" + i + "]" + ": " + (i + 1));
        }

        System.out.println("Full array element: " + Arrays.toString(numberArray));
    }
}
