package com.assignment;

import java.util.Scanner;

class InsufficientBalance extends Exception{
	double amount;
	
	public InsufficientBalance(double amount) {
		this.amount=amount;
		System.out.println("Insufficient Balance for withdrawal");
	}
} 

class ATM
{
	double balance;
	public void deposit(double amount) {
		balance +=amount;
		System.out.println(amount+" Rs. deposited");
	}
	
	public void withdrawal(double amount) throws InsufficientBalance {
		if(amount<=balance) {
			balance -=amount;
			System.out.println(amount+" rs. wothdrwal Successfully");
		}else {
			double lessbalance = amount - balance;
			throw new InsufficientBalance(amount);
		}
		
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deposit amount..");
		double amount = sc.nextDouble();
		
		ATM atm = new ATM();
		atm.deposit(amount);
		
		System.out.println("Successfully deposited "+amount);
		
		System.out.println("Enter Withdrawal amount..");
		amount  =sc.nextDouble(); 
		try {
			atm.withdrawal(amount);
		} catch (InsufficientBalance e) {
			e.printStackTrace();
		}

	}

}
