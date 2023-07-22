package com.assignment;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="vishal";
		String b="vishal";
		String c = new String("vishal");
		
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a==c);
		
		System.out.println(a.concat(" Modi"));
	}

}
