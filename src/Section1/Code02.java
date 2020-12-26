package Section1;

import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		int num = 123;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please eneter an integer: ");
		
		int input = kb .nextInt();
		
		kb.close();
		
		if (input == num) 
			System.out.println("match!");
		else 
			System.out.println("do not match!:-(");
		
		
		
	}
}
