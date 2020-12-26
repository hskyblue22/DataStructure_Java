package Section1;

import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {
		
		String name = null;
		int age;
		String gender;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please type your name, age and gender ");
		
		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();
		
		if (gender.equals("male"))
			System.out.println(name + ", you're " + age + " years old man");
		else if (gender.equals("female"))       // string literal
			System.out.println(name + ", you're " + age + " years old woman");
		else
			System.out.println("Hi " + name);
		
		kb.close();
	}

}
