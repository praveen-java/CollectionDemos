package com.collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		System.out.println("This is the Iterator Demo");
		String remove = "C++.....";
		List<String> lst = new ArrayList<String>();
		
		lst.add("Praveen");
		lst.add("ani");
		lst.add("Strings....");
		lst.add("Collections.....");
		lst.add("C++.....");
		lst.add("java.....");
		lst.add("perl");
		System.out.println("Before Iteration..."+lst);
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext()) {
			//System.out.println(" Iteratered String is::"+itr.next());
			if(remove.equals(itr.next()))
				itr.remove();
		}
		System.out.println("After Iteration..."+lst);
	}

}
