package work.Selenium.Day1;

import java.util.ArrayList;
import java.util.Collections;

public class Implement_ArrayList {

	public static void main(String[] args) {
		
		/*1. Create an ArrayList and insert and retrieve value at a specified index.
2. Replace an element at specified index in Arraylist
3. Search an element of Java ArrayList*/

		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(14);
		al.add(16);
		al.add(5);
		al.add(2);
		
		al.set(1,25);
		System.out.println(al.get(0));
		System.out.println(al);
		System.out.println(al.contains(16));
		System.out.println(Collections.binarySearch(al,16));
		
		

	}

}
