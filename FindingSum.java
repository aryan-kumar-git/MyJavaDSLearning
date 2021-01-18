package dataStructures.listDS;
import java.util.*;
public class FindingSum {

	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter your moblie number : ");
		String n = sc.next();
		
		//Converting the string to character array
		char arr[] = n.toCharArray();
		
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < n.length(); i++) {
			
			//Taking the numerical value of the character
			int c = Character.getNumericValue(arr[i]);
			if(c % 2 == 0) {
				even += c;
			}else odd += c;
		}
		
		System.out.println("The sum of even values : " + even);
		System.out.println("The sum of odd values : " + odd);
		
		if(even > odd) {
			System.out.println("Access Granted");
			
		} else if(even == odd) {
			System.out.println("Let me ask my boss...");
			//Delaying the program for 2500 ms
			Thread.sleep(2500);
			System.out.println("Access granted");
			
		} else System.out.println("Access denied");
		
		sc.close();
		
	}
	
}

