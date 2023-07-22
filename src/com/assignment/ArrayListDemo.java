package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(123);
		a1.add("Vishal");
		a1.add("A");
		a1.add(12.23f);
		a1.add("Vishal");
		a1.add(2.5d);
		
		System.out.println("Array List size is..."+a1.size());
		System.out.println("ArrayList is..."+a1);
		a1.remove(0);
		
		System.out.println("Array List size is..."+a1.size());
		System.out.println("ArrayList is..."+a1);
		
		Iterator i1 = a1.iterator();
		while (i1.hasNext()) {
			System.out.println("iterator...."+i1.next());
			
		}
		
		for(Object o:a1) {
			System.out.println(o);
		}
		
		a1.forEach(System.out::println);
		
		a1.forEach(name ->System.out.println(name));
		
		// update specific element of an array
		a1.set(3, "Vishal Modi");
		System.out.println("updated array"+a1);
		//remove 3rd element
		a1.remove(3);
		ArrayList b = new ArrayList<>();
		b=a1;
		System.out.println("copy array into other"+b);
		
		
	}

}
