package Section1;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please type a string: ");
		
		input = kb.next();
		
		if (str.equals(input))  {
			System.out.println("match!");
		} else {
			System.out.println("do not match!:-(");
		}
		
		kb.close();
		

	}

}
