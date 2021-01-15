package section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {

	static MyRectangle1 [] rects;      // 변수 생성
	static int n = 0;  //사각형의 개수_읽기 전에 몇개인지 알 수 없음

	public static void main(String[] args) {

		rects = new MyRectangle1[100];   // 배열 생성
		try {
			Scanner in = new Scanner(new File("data.txt"));

			while(in.hasNext()) 				
				rects[n++] = new MyRectangle1(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()); // 객체 생성
			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}

		bubbleSort();
		
		for (int i=0; i<n; i++) {
			System.out.println(rects[i].toString());
		}

	}

	private static void bubbleSort() {
		for (int i=n-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				if (rects[j].calcArea() > rects[j].calcArea()) {
					// 사각형 넓이 swap
					MyRectangle1 tmp = rects[j]; // 객체의 값을 바꾼게 아님
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}		
	}
	
}
