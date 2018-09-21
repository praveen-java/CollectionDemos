package com.collectiondemos.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class BasicVectorOperations {
	public static void main(String[] args) {
			Vector<String> vet = new Vector<String>();
			vet.add("First");
			vet.add("Second");
			vet.add("Third");
			vet.add("Fourth");
			System.out.println("The vector is :: "+vet);
			vet.add(2, "random");
			System.out.println("The vector is :: "+vet);
			System.out.println("Element at 3rd index is :: "+vet.get(3));
			System.out.println("First element in the vector is :: "+vet.firstElement());
			System.out.println("Last element in the vector is :: "+vet.lastElement());
			System.out.println("Is the vector empty ? "+vet.isEmpty());
			
			System.out.println("Iterating the vector using Iterator...  ");
			
			Iterator itr = vet.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println("Iterating the vector using ListIterator...  ");
			ListIterator<String> li = vet.listIterator();
			while(li.hasNext()) {
				System.out.println(li.next());
			}
			
			System.out.println("Iterating the vector using Enumerator...  ");
			Enumeration<String> en = vet.elements();
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement());
			}
	}

}
