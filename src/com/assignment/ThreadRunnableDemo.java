package com.assignment;

class Second implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Second Thread......"+i);
		}
		System.out.println("Second thread is completed");
	}
	
}

public class ThreadRunnableDemo {

	public static void main(String[] args) {
		
		Second s1 = new Second();
		Thread t1 = new Thread(s1);
		t1.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thread......"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main thread is completed");
	}

}
