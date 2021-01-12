package Section1;

public class Code01 {
	
	public static int num;

	public static void main(String[] args) {
		int anotherNum = 5;
		num =2;
		
		System.out.println(num+anotherNum);
		System.out.println("num: "+ num);
		System.out.println("anotherNum: "+ anotherNum);
		
		System.out.println("Sum: "+ num + anotherNum);  // Sum:25
		System.out.println("Sum: "+ (num + anotherNum));

	}

}
