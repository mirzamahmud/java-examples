package com.mirza.lib;

public class JavaOperators {
    // ================================== Arithmetic operator: +, -, *, /, %
    void exampleArithmeticOperator(){
        System.out.println("Addition: " + (10 + 10));
        System.out.println("Subtraction: " + (10 - 10));
        System.out.println("Multiplication: " + (10 * 10));
        System.out.println("Division: " + (10 / 10));
        System.out.println("Modulus: " + (5 % 10));
    }

    // ================================== Comparison operator: ==, !=, >, <, >=, <=
    void exampleComparisonOperator(){
        System.out.println("Equal To: " + (10 == 10));
        System.out.println("Not Equal: " + (10 != 10));
        System.out.println("Greater than: " + (10 > 10));
        System.out.println("Less than: " + (10 < 10));
        System.out.println("Greater than or equal: " + (5 >= 10));
        System.out.println("Less than or equal: " + (5 <= 10));
    }

    // ================================== Logical operator: && (and), || (or), !(not)
    boolean isRainy = true;
    boolean needUmbrella = true;

    void exampleLogicalOperator(){
        System.out.println("Should go outside: " + (isRainy && needUmbrella));
        System.out.println("Should not go outside: " + (isRainy || !needUmbrella));
        System.out.println("Not: " + (!needUmbrella));

    }
}
