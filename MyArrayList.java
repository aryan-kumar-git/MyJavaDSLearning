package dataStructures.listDS;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		ArrayList<String> vegetables = new ArrayList<>();
		
		vegetables.add("Tomato");
		
		fruits.addAll(vegetables);
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e : temp) {
			System.out.println(e);
		}
		
		System.out.println(fruits);
		
		fruits.clear();
		
		System.out.println(fruits);

	}

}
