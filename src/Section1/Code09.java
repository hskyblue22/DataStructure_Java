package Section1;

import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		// n���� ������ �Է¹޾� ������� �迭�� ����, ��� �������� �� ĭ�� ���������� �̵�, ������ ������ �迭�� ù ĭ���� �̵�
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] array = new int [n];
		
		for (int i =0; i<n; i++) {
			array[i] = kb.nextInt();
		}
		kb.close();
		
		int tmp = array[n-1];
		for (int j=n-2; j>=0; j--) {
			array[j+1] = array[j];
		}
		array[0] = tmp;
		
		for(int k=0; k<n; k++)
			System.out.print(array[k]+ " ");

	}

}
