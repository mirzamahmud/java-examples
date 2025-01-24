package com.mirza.lib;

public class JavaMethod {
    // method is a block of code that is used to execute a specific task.
    // In java, there is two methods -> 1. user defined methods, 2. standard library methods.

    // method is executing by declare it and call it from anywhere.

    // Syntax for declaring a method -> returnType methodName(){method body}

    // returnType [void] means this method doesn't return any value.
    void exampleOfMethod(){
        System.out.println("=========================== Methods ====================================");
        System.out.println("This is a user defined method");
        System.out.println("Return Type Method: " + addTwoNumbers());
    }

    // [addTwoNumbers] is a method which will return [int] value.
    int addTwoNumbers(){
        int x = 2;
        int y = 1;
        return (x + y);
    }

    // create a parameterised method
    void exampleOfParameterisedMethod(String name, int age){
        System.out.println("======================= Parameterised Method ===========================");
        String myName = name;
        int myAge = age;
        System.out.println("Name: " + myName);
        System.out.println("Age: " + age);
    }
}
