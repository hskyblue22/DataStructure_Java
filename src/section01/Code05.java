package section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {

	static MyRectangle1 [] rects;      // ���� ����
	static int n = 0;  //�簢���� ����_�б� ���� ����� �� �� ����

	public static void main(String[] args) {

		rects = new MyRectangle1[100];   // �迭 ����
		try {
			Scanner in = new Scanner(new File("data.txt"));

			while(in.hasNext()) 				
				rects[n++] = new MyRectangle1(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()); // ��ü ����
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
					// �簢�� ���� swap
					MyRectangle1 tmp = rects[j]; // ��ü�� ���� �ٲ۰� �ƴ�
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}		
	}
	
}
