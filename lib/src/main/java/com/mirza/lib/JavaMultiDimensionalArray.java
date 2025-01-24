package com.mirza.lib;

import java.util.Arrays;

public class JavaMultiDimensionalArray {
    // ======================= syntax of 2D array: dataType[][] arrayName = new dataType[rows][columns]
    // ======================= declare 2D array =========================
    int [][] matrixA = new int[2][2];
    int [][] matrixB = new int[2][2];
    int [][] matrixSum = new int[2][2];

    // ======================= display ==================================
    void exampleOfMultidimensionalArray(){
        System.out.println("======================= Multi-Dimensional Array ========================");
        insertDataInMatrixA();
        insertDataInMatrixB();
        showMatrixA();
        showMatrixB();
        sumOfTwoMatrix();
        showResult();
    }

    // ======================= insert data in matrix-A ==================
    void insertDataInMatrixA(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                matrixA[i][j] = 5;
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    void showMatrixA(){
        System.out.println("Matrix-A: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    void insertDataInMatrixB(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                matrixB[i][j] = 4;
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    void showMatrixB(){
        System.out.println("Matrix-B: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    void sumOfTwoMatrix(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    void showResult(){
        System.out.println("Matrix-Sum: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
