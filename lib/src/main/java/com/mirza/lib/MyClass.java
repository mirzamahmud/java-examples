package com.mirza.lib;

public class MyClass {
    // object -> is a instance of a class
    // class -> is a template or blueprint


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
        // ================ conditional statement =======
        JavaConditionalStatement javaConditionalStatement = new JavaConditionalStatement(10);
        javaConditionalStatement.exampleOfConditionalStatement();
        // ================ switch statement ============
        JavaSwitchStatement javaSwitchStatement = new JavaSwitchStatement(3);
        javaSwitchStatement.exampleOfSwitchStatement();
        // ================ While Loop ==================
        JavaWhileLoop javaWhileLoop = new JavaWhileLoop();
        javaWhileLoop.exampleOfWhileLoop();
        // ================ For Loop ====================
        JavaForLoop javaForLoop = new JavaForLoop();
        javaForLoop.exampleOfForLoop();
        // ================ Break Keyword ===============
        JavaBreakKeyword javaBreakKeyword = new JavaBreakKeyword();
        javaBreakKeyword.exapleOfBreakKeyword();
        // ================ Continue Keyword ============
        JavaContinueKeyword javaContinueKeyword = new JavaContinueKeyword();
        javaContinueKeyword.exampleOfContinueKeyword();
        // ================ Array =======================
        JavaArray javaArray = new JavaArray();
        javaArray.exampleOfArray();
        // ================ For-Each Loop ===============
        JavaForEachLoop javaForEachLoop = new JavaForEachLoop();
        javaForEachLoop.exampleOfForEach();
        // ================ Multi-dimensional Array =====
        JavaMultiDimensionalArray javaMultiDimensionalArray = new JavaMultiDimensionalArray();
        javaMultiDimensionalArray.exampleOfMultidimensionalArray();
        // ================ Methods =====================
        JavaMethod javaMethod = new JavaMethod();
        javaMethod.exampleOfMethod();
        javaMethod.exampleOfParameterisedMethod("Mirza Mahmud", 26);
        // ================ Method overloading ==========
        JavaMethodOverloading javaMethodOverloading = new JavaMethodOverloading();
        javaMethodOverloading.exampleOfMethodOverloading();
    }
}