package com.assignment;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3};
		int []b = {2,3,4};
		 int d=0;
		
		for(int i=0;i<a.length;i++) {
			int c= a[i]+b[i];
			System.out.println(c);
		}
		
		for(int i=0;i<a.length;i++) {
			d=d+a[i];
		}
		System.out.println("Sum of array: "+d);
		System.out.println("Avearge value of array: "+d/(a.length));
		
		int element=3;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==element)
				index=i;
		}
		
		System.out.println("index of array"+index);
	}
	
	
	

}
