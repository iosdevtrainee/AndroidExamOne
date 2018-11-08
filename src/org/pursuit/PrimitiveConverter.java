package org.pursuit;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class PrimitiveConverter {
    static Integer intToInteger(int x){
//        Integer y = new Integer(x);
        return x;
    }
    static Double doubleToDouble(double x){
//        Double y = new Double(x);
        return x;
    }
    static Character charToCharacter(char y){
//        Character z = new Character(y);
        return y;
    }
    static Boolean booleanToBoolean(boolean d){
//        Boolean a = new Boolean(d);
        return d;
    }

}
