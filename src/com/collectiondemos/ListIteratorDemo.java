package com.collectiondemos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(5);
		ilist.add(7);
		ilist.add(2);
		ilist.add(9);
		ListIterator<Integer> il = null;
		il = ilist.listIterator();
		System.out.println("elements in forward direction....");
		while(il.hasNext()) {
			System.out.println("element is ::"+il.next());
		}
		System.out.println("elements in reverse order.....");
		while(il.hasPrevious()) {
			System.out.println("element is :: "+il.previous());
		}
	}

}
