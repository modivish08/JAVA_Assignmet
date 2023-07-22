package com.assignment;

import java.util.Scanner;

public class ScaneerDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Marks is");
		int a = sc.nextInt();
		if(a>=91 && a<=100)
			System.out.println("Grade is AA");
		else if(a>=81 && a>=90)
			System.out.println("Grade is AB");
		else if(a>=71 && a<=80)
			System.out.println("Grade is BB");
		else if(a>=61 && a<=70)
			System.out.println("Grade is BC");
		else if(a>=51 && a<=60)
			System.out.println("Grade is CD");
		else if(a>=41 && a<=50)
			System.out.println("Grade is DD");
		else
			System.out.println("Fail");
	}
}
