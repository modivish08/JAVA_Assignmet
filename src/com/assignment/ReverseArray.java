package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		
		int[] arr = { 10, 20, 30, 40, 50};
		int j=arr.length;
		int b[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			b[j-1]=arr[i];
			j=j-1;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(b[k]);
		}
		
	}
	

}
