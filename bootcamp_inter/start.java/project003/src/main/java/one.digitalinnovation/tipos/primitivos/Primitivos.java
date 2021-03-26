package one.digitalinnovation

public class Primitivos {
	
	public static void main(String[] args) {
		//INTEIROS
		
		//byte nullByte= null;
		
		byte b;            //8 bits
		byte b1 = 127;
		byte b2 = -128;
		//byte b3 = 129;   //to large
		
		char c;            //16 bits
		char c1 = 'A';
		char c2 = 15;
		//char c3 = 'AA';  //NOK
		//char c4 = -100;  //NOK
		
		short s;    //16 bits
		short s1 = 32767;
		short s2 = -32768;
		
		int i = 2147483647;   //32 bits
		int i2 = -2147483648;
		//int i3 = -2147483649; //to large
		
		
		long l = 9223372036854775807L;   //64 bits
		long l2 = -92233722036854775808L;
		//long l3 = 922337220368547758088L;    //to large
		
		//FLUTUANTES
		
		float f = 65f;    //32 bits   3.402,823,5 E+308
		flot f2 = 65.0f;
		float f3 = -0.5f; //1.4 E-45
		
		//Boleano
		
		boolean bo = true;
		boolean bo2 = false;
		//boolean bo3 = "false"; //NOK
		//boolean bo4 = 'true'; //NOK
		
		//void v; //palavra reservada
		
		
		//System.out.println("byte : " + b); //ERROR
		
	}
}