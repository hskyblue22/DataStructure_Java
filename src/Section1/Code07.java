package Section1;

public class Code07 {

	public static void main(String[] args) {
		
		int [] grades = new int [5];
		
		grades[0] = 100;
		grades[1] = 50;
		grades[2] = 70;
		grades[3] = 40;
		grades[4] = 20;
		
		int i =0;
		while (i<grades.length) {
			System.out.println("Grade"+(i+1)+": "+ grades[i]);
			i++;
		}

	}

}
