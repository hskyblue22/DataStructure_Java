package section2;

public class Polynomial2 {
	public char name;
	public int nterms=0;   // ���׽��� �� ����
	public Term2 [] terms;  // ���׽��� �����ϴ� �׵��� ������ �迭

	// polynomial (���׽�)�� ������ �޼���� ���� �Ű���
	public int calcPolynomial(int x) {
		int sum = 0;
		for (int i=0; i<nterms; i++)
			sum += terms[i].calcTerm(x);
		return sum;
	}


	public void printPolynomial() {
		for (int i =0; i < nterms ; i++) {
			if (i != nterms-1) {
				terms[i].printTerm();
				if (terms[i+1].coef > 0) {
					System.out.print("+");
				}
			}
		
			else {
				if (terms[i].expo == 0) {
					System.out.print(terms[i].coef);
				}
				else {
					terms[i].printTerm();
				}
				System.out.println();
			}
		}
	}
	public void addTerm(int c, int e) {  // ���׽� p
		int index = findTerm(e);
		if (index != -1) {
			terms[index].coef += c;
		}
		else {
			int i =nterms-1; // i ���׽� �ε���
			while (i>=0 && terms[i].expo < e) {  // ���׽� �� �׵� ������������ ����
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term2();
			terms[i+1].coef = c;
			terms[i+1].expo = e;
			nterms++;
		}
	}

	public int findTerm( int e) {
		for (int i=0; i< nterms && terms[i].expo >= e; i++) 
			if (terms[i].expo == e)
				return i;
		return -1;  // ���� ���� ����
	}
}
