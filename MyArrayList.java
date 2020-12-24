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
			System.out.print(e + " ");
		}
		System.out.println("\n");
		
		System.out.println(fruits.get(2)+"\n");
		
		fruits.remove(2);
		
		System.out.println(fruits+"\n");
		
		fruits.removeAll(vegetables);
		
		System.out.println(fruits+"\n");
		
		fruits.clear();
		
		System.out.println(fruits);

	}

}
