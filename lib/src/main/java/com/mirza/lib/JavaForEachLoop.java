package com.mirza.lib;

import java.util.Arrays;

public class JavaForEachLoop {
    int[] arrayElement = new int[10]; // ===================== declare array with size
    int[] evenNumbers; // =================== declare array without size

    void insertDataInArrayElement(){
        // ================================ insert data ==============================
        for(int i = 0; i < arrayElement.length; i++){
            arrayElement[i] = i + 1;
        }

        System.out.println("Array Element: " + Arrays.toString(arrayElement));
    }

    void insertItemInEvenNumbersArray() {

        // ========================== generate array size =============================
        int evenCount = 0;
        for (int item : arrayElement) {
            if (item % 2 == 0) {
                evenCount++;
            }
        }

        // ========================== initialize array size ===========================
        evenNumbers = new int[evenCount];
        int index = 0;

        // ========================== insert data into array ==========================
        for (int item : arrayElement) {
            if (item % 2 == 0) {
                evenNumbers[index++] = item;
            }
        }

        System.out.println("Even Numbers: " + Arrays.toString(evenNumbers));
    }

    void exampleOfForEach(){
        System.out.println("================================ For-Each Loop ===============================");
        insertDataInArrayElement();
        insertItemInEvenNumbersArray();
    }
}
