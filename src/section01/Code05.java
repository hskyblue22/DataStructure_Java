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

			while(in.hasNext()) {
				
				rects[n] = new MyRectangle1(); // 객체 생성
				rects[n].lu = new MyPoint1();  // 객체 생성
				
				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt();
				rects[n].height = in.nextInt();
				n++;
			}
			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}

		bubbleSort();
		
		for (int i=0; i<n; i++)
			System.out.println(rects[i].lu.x+" "+rects[i].lu.y+" "+rects[i].width+" "+rects[i].height);
	}

	private static void bubbleSort() {
		for (int i=n-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				if (calcArea(rects[j]) > calcArea(rects[j+1])) {
					// 사각형 넓이 swap
					MyRectangle1 tmp = rects[j]; // 객체의 값을 바꾼게 아님
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}		
	}
	public static int calcArea(MyRectangle1 r) {
		return r.width * r.height;
	}
}
