package org.pursuit;

public class Overloader {
    static double doubleDivision(int x, int y){
        double a = x;
        double b = y;
        return a / b;
    }
    static double doubleDivision(int x, double y){
        double a = x;
        return a / y;
    }
    static double doubleDivision(double x, int y){
        double a = y;
        return x / a;
    }
    static double doubleDivision(double x, double y){
        return x / y;
    }

}
