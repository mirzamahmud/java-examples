package com.mirza.lib;

public class MyClass {
    // ============ main method =================
    public static void main(String[] args){
        // ================ java output ================
        System.out.println("Hello Java!");
        // ================ variables ===================
        JavaVaribale javaVaribale = new JavaVaribale();
        javaVaribale.display();
        // ================ data types ==================
        JavaDataTypes primitiveType = new JavaDataTypes();
        JavaDataTypes nonPrimitiveType = new JavaDataTypes();
        primitiveType.displayPrimitiveType();
        nonPrimitiveType.displayNonPrimitiveType();
        // ================ Type Casting ================
        JavaTypeCasting javaTypeCasting = new JavaTypeCasting();
        javaTypeCasting.displayImplicitTypeCast();
        javaTypeCasting.displayExplicitTypeCast();
        javaTypeCasting.displayDifferentTypeCasting();
        // ================ Operators ===================
        JavaOperators javaOperators = new JavaOperators();
        javaOperators.exampleArithmeticOperator();
        javaOperators.exampleComparisonOperator();
        javaOperators.exampleLogicalOperator();
        // ================ String ======================
        JavaString javaString = new JavaString("Mirza", "Mahmud", "Hossan");
        javaString.displayOutput();
    }
}