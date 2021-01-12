package Section1;

import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		// 사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하는 코드
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] array = new int [n];
		
		for (int i =0; i<n; i++) {
			array[i] = kb.nextInt();
		}
		kb.close();
		
		int sum = 0;
		int max = array[0];
		
		for (int k=0; k<n; k++) {
			sum += array[k];
			if (max < array[k]) {
				max = array[k];	
			}
		}
		
		System.out.println("The sum is "+ sum);
		System.out.println("The max is "+ max);
	}

}
