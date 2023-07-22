package com.assignment;

public class MinmaxArray {
	
	public int max(int[] array) {
		int max=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		return max;
		
	}
	public int min(int[] array) {
		int min = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
		
	}
	
	public static void main(String[] args) {
		
		int[] array = {12,26,73,84,55,06};
		
		int max=array[0];
		int min=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			else if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("Maximum value from Array"+max);
		System.out.println("Maximum value from Array"+min);
		
//		MinmaxArray m = new MinmaxArray();
//		System.out.println(m.max(array));
//		System.out.println(m.min(array));
		
			
		}
	}


