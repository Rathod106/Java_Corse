package SonaliRathod;

public class Unboxing1 {
	    
	    public static void main(String[] args) {
	        
	        // Wrapper classes to primitive types (Unboxing)
	        Byte byteObj = 04;
	        byte bytePrimitive = byteObj;
	        
	        Short shortObj = 24;
	        short shortPrimitive = shortObj;
	        
	        Integer intObj = 400;
	        int intPrimitive = intObj;
	        
	        Long longObj = 30L;
	        long longPrimitive = longObj;
	        
	        Float floatObj = 60.5f;
	        float floatPrimitive = floatObj;
	        
	        Double doubleObj = 50.65;
	        double doublePrimitive = doubleObj;
	        
	        Character charObj = 'S';
	        char charPrimitive = charObj;
	        
	        Boolean boolObj = true;
	        boolean boolPrimitive = boolObj;
	        // Printing the unboxed values
	        System.out.println("byte: " + bytePrimitive);
	        System.out.println("short: " + shortPrimitive);
	        System.out.println("int: " + intPrimitive);
	        System.out.println("long: " + longPrimitive);
	        System.out.println("float: " + floatPrimitive);
	        System.out.println("double: " + doublePrimitive);
	        System.out.println("char: " + charPrimitive);
	        System.out.println("boolean: " + boolPrimitive);
	     }
	}
/*
byte: 4
short: 24
int: 400
long: 30
float: 60.5
double: 50.65
char: S
boolean: true
*/
