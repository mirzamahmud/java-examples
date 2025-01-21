package com.mirza.lib;

public class JavaDataTypes {
    // Java has two categories data types -> Primitive and Non-primitive
    // Primitive Data types -> byte, short, int, long, float, double, char, boolean
    // Non-primitive Data Types -> Array, String, Class, etc...

    // ==================== primitive data types ============================
    byte byteNumber = -128; // -128 to 127
    short shortNumber = 32500; // -32,768 to 32767
    int intNumber = 2147483647; // -2147483648 to 2147483647
    long longNumber = 8906677899997578969L;
    float floatNumber = 10.8989000088776F;
    double doubleNumber = 10.898900008877656778855555555555578932444;
    char charType = 'A';
    boolean isTrue = true;

    void displayPrimitiveType(){
        System.out.println("Byte: " + byteNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Int: " + intNumber);
        System.out.println("Long: " + longNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Char: " + charType);
        System.out.println("Boolean: " + isTrue);
    }

    // ===================== non primitive or reference data type =================
    int intArray[] = {1, 2, 3, 4, 5, 6};
    String name = "Mirza Mahmud Hossan";

    void displayNonPrimitiveType(){
        for(int index = 0; index < intArray.length; index++){
            System.out.println("Array: " + intArray[index]);
        }
        System.out.println("String: " + name);
    }
}
