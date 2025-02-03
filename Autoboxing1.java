package SonaliRathod;

public class Autoboxing1 {

	    public static void main(String[] args) {
	        // Autoboxing examples for all primitive types 
	        // byte to Byte
	        byte bytePrimitive = 04;
	        Byte byteObject = bytePrimitive;
	        System.out.println("byteObject: " + byteObject);
	        // short to Short
	        short shortPrimitive = 24;
	        Short shortObject = shortPrimitive;
	        System.out.println("shortObject: " + shortObject);
	        // int to Integer
	        int intPrimitive = 45;
	        Integer intObject = intPrimitive;
	        System.out.println("intObject: " + intObject);
	        // long to Long
	        long longPrimitive = 32L;
	        Long longObject = longPrimitive;
	        System.out.println("longObject: " + longObject);
	        // float to Float
	        float floatPrimitive = 100.5f;
	        Float floatObject = floatPrimitive;
	        System.out.println("floatObject: " + floatObject);
	        // double to Double
	        double doublePrimitive = 60.65;
	        Double doubleObject = doublePrimitive;
	        System.out.println("doubleObject: " + doubleObject);
	        // char to Character
	        char charPrimitive = 'S';
	        Character charObject = charPrimitive;
	        System.out.println("charObject: " + charObject);
	        // boolean to Boolean
	        boolean booleanPrimitive = true;
	        Boolean booleanObject = booleanPrimitive;
	        System.out.println("booleanObject: " + booleanObject);
	    }
	}
/*Output
byteObject: 4
shortObject: 24
intObject: 45
longObject: 32
floatObject: 100.5
doubleObject: 60.65
charObject: S
booleanObject: true*/