package com.course.syntax;

public class StepFirst {
    public static void main(String[] args) {
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = 2147483647;
        long longVariable = 9223372036854775807L;
        float floatVariable = 3.14f;
        double doubleVariable = 3.14159265359;
        char charVariable = 's';
        boolean booleanVarialbe = false;
        final String constantString = "Constant value";

        //print all of them with concatenation
        System.out.println("byte variable = " + byteVariable + ", short variable = " + shortVariable + ", int variable = " + intVariable + ", long variable = " + longVariable + ", float variable = " + floatVariable + ", double variable = " + doubleVariable + ", char variable = " + charVariable + ", boolean varialbe = " + booleanVarialbe + ", constant = "+ constantString);
    }
}
