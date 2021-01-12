package Section1;

public class Code10 {

	public static void main(String[] args) {
		// 1~100000 사이의 모든 소수들을 찾아서 출력하는 프로그램
		
		for (int n=1; n<=100000; n++) {
			boolean isPrime = true;
			if (n==1) {
				isPrime = false;
			}
			for (int i=2; i*i<=n && isPrime; i++) {
				if (n % i ==0)
					isPrime = false;
			}			
		if (isPrime)
			System.out.println(n);
		}	
	}
}
