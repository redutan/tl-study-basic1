package org.opentutorials.java.chapter04;

public class IntDatetypeDemo {
	public static void main(String[] args) {
		byte a;
//		a = 128;
		a = 127;
		System.out.println(a);
		
		a = (byte)0x111111;
		System.out.println(a);
		
		short c = (short)0x7FFF;
		System.out.println(c);
		
		int b = 0xFFFFFF;
		System.out.println(b);
	}
}
