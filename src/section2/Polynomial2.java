package section2;

public class Polynomial2 {
	public char name;
	public int nterms=0;   // 다항식의 항 개수
	public Term2 [] terms;  // 다항식을 구성하는 항들을 저장할 배열

	// polynomial (다항식)과 연관된 메서드들 전부 옮겼음
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
	public void addTerm(int c, int e) {  // 다항식 p
		int index = findTerm(e);
		if (index != -1) {
			terms[index].coef += c;
		}
		else {
			int i =nterms-1; // i 다항식 인덱스
			while (i>=0 && terms[i].expo < e) {  // 다항식 내 항들 내림차순으로 정렬
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
		return -1;  // 같은 지수 없음
	}
}
