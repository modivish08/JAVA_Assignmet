package com.assignment;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=15;
		int[] b = {1,2,3};
		try {
			System.out.println(b[4]);
			System.out.println(i/0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("vishal");
	
		
	}

}
