package Section1;

import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		// n개의 정수를 입력받아 순서대로 배열에 저장, 모든 정수들을 한 칸씩 오른쪽으로 이동, 마지막 정수는 배열의 첫 칸으로 이동
		
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
