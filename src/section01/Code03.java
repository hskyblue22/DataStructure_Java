
package section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code03 {

	static Person1 [] members= new Person1 [100];
	static int n=0;
	
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("input.txt"));
			while (in.hasNext()) {
				String nm = in.next();
				String num = in.next();
				
				members[n] = new Person1();  // Person1 객체 생성
				members[n].name = nm;
				members[n].number = num;
				n++;
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}
		
		bubbleSort();
		
		for (int i=0; i<n; i++) 
			System.out.println(members[i].name + " " + members[i].number);
	}

	static void bubbleSort() {
		
		for (int i=n-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				if (members[j].name.compareTo(members[j+1].name)>0) {
					// swap two persons
					// name, number 따로따로 swap 해줄 필요X
					Person1 tmp = members[j];
					members[j] = members[j+1];
					members[j+1] = tmp;
				}		
			}
		}
	}

	
}
