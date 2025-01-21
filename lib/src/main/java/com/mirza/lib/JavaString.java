package com.mirza.lib;

public class JavaString {

    // ===================================== declare string variables ==========================================
    String firstName, middleName, lastName;
    String fullName;

    // ===================================== create parameterized constructor ==================================
    JavaString(String fName, String mName, String lName){
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.fullName = fName + " " + mName + " " + lName; // ================== String concatenation ==========
    }

    // ===================================== display output =====================================================
    void displayOutput(){
        System.out.println("============================ String ==================================");
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + fullName);

        // ================================= length of string ===================================================
        System.out.println("Length of String: " + fullName.length());

    }
}
