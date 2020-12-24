package dataStructures.listDS;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		//Created a new ArrayList
		ArrayList<String> fruits = new ArrayList<>();
		
		//Added some elements to it
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		//Created another ArrayList 
		ArrayList<String> vegetables = new ArrayList<>();
		
		vegetables.add("Tomato");
		
		//Using the addAll function
		fruits.addAll(vegetables);
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e : temp) {
			System.out.print(e + " ");
		}
		System.out.println("\n");
		
		//Using the get function
		System.out.println(fruits.get(2)+"\n");
		
		//Using the remove function
		fruits.remove(2);
		
		System.out.println(fruits+"\n");
		
		//Using the removeAll function
		fruits.removeAll(vegetables);
		
		System.out.println(fruits+"\n");
		
		//Using the clear function
		fruits.clear();
		
		System.out.println(fruits);

	}

}
