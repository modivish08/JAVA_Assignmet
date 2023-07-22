package com.assignment;

public class Pyramid6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=5;i>=1;i--) {
			for(int j=i;j<=5;j++) {
				System.out.print(k++);
			}
			System.out.println();
		}
		
		int a=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
	}

}
