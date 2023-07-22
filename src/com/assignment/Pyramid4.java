/**
 * 
 */
package com.assignment;

/**
 * @author Palak Vishal
 *
 */
public class Pyramid4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				if((i+j)%2==0)
					System.out.print("0");
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
		
		
		for(int i=1;i<=4;i++) {
			for (int j=5-i;j>1;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i=i+2) {
			for(int k=5-i;k>1;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i=i-2) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i=i+2) {
			for(int k=5-i;k>1;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=3;i>=1;i=i-2) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
