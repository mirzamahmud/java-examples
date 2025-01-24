package com.mirza.lib;

public class JavaMethodOverloading {
    /* Method Overloading means, multiple methods of same name with different parameters */

    void exampleOfMethodOverloading(){
        System.out.println("========================== Method Overloading ==========================");
        display();
        System.out.println("Two Parameterised Method: " + display(10, 20));
        display("Abcd", "abcd@gmail.com", "Bangladesh");
    }

    void display(){
        System.out.println("Method has no parameter");
    }

    int display(int num1, int num2){
        return  num1 + num2;
    }

    void display(String username, String email, String address){
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}
