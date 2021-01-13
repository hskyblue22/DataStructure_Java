package section2;

import java.util.Scanner;

public class Code07 {

	static Polynomial2 [] polys = new Polynomial2 [100];   // 다항식의 최대개수:100 최대개수 넘어버리면 생기는 문제는 나중에 다룸
	static int n=0;                                      // 다항식 개수
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			
			if (command.equals("create")) {
				char name = kb.next().charAt(0); // char는 입력단위 없다.
				polys[n] = new Polynomial2();
				polys[n].name = name;
				polys[n].terms = new Term2[100];
				polys[n].nterms = 0;   // 안해도 됨
				
				n++;
			}
			else if (command.equals("add")) {   // add f 2 3
				char name = kb.next().charAt(0);
				int index = find(name);
				
				if (index==-1) {
					System.out.println("No such polynomial exists");
				}
				else {
					int c = kb.nextInt();
					int e = kb.nextInt();
					polys[index].addTerm(c,e); // 다항식 객체에 대한 참조를 넘겨줌
				}
				
			}
			else if (command.equals("calc")) {
				char name = kb.next().charAt(0);
				int index = find(name);
				
				if (index==-1) {
					System.out.println("No such polynomial exists");
				}
				else {
					int x = kb.nextInt();
					int result = polys[index].calcPolynomial(x);
					System.out.println(result);
				}
			}

			else if (command.equals("print")) {
				char name = kb.next().charAt(0);
				int index = find(name);
				
				if (index==-1) {
					System.out.println("No such polynomial exists");
				}
				else {
					polys[index].printPolynomial();
				}
				
			}
			else if (command.equals("exit")) {
				break;
			}

		}
		
		kb.close();
	}

	

	private static int find(char name) {
		for (int i=0; i<n; i++) 
			if (polys[i].name == name)
				return i;
		return -1;
	}
	// term2, polynomial클래스에 각각 연관된 기능가진 메서드들 넘겨줌으로써 code07 매우 간결해졌음

}
