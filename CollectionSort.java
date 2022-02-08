package com.sortingcollection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		
	   List<String> al=new ArrayList<String>();
		
		al.add("jkjfhnksd");
		al.add("hgv");
		al.add("dnc");
		al.add("cvnd");
//		Collections.sort(al);
		Collections.sort(al,Collections.reverseOrder());
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()){  
			System.out.println(it.next());  
			 }  
		
		
	}

}
