package com.collectiondemos.vector;

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
			
			
	}

}
