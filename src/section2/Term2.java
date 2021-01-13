package section2;

public class Term2 {

	public int coef;
	public int expo;
	
	public int calcTerm(int x) {
		return (int)(coef * Math.pow(x,expo));
	}
	public void printTerm() {
		if (coef != 0 && expo != 0 ) {
			System.out.print(coef + "x^" + expo);
		}
	}
}
