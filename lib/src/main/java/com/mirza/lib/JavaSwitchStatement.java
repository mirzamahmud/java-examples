package com.mirza.lib;

public class JavaSwitchStatement {
    int dayOfWeek;
    JavaSwitchStatement(int numberOfDay){
        this.dayOfWeek = numberOfDay;
    }

    void exampleOfSwitchStatement(){
        System.out.println("================================== Switch Statement ==============================");
        switch (dayOfWeek){
            case 1:
                System.out.println("Friday");
                break;
            case 2:
                System.out.println("Saturday");
                break;
            case 3:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Tuesday");
                break;
            case 6:
                System.out.println("Wednesday");
                break;
            case 7:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("No name of the day");
                break;
        }
    }
}
