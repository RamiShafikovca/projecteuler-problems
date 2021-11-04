public class Problem14 {
	public static void main(String[] args) {
		int terms, mostTerms=0;
		//for (int i=13; i<1000000; i++) {
		int i=13;
			terms = 0;
			while (i > 1) {
				System.out.print(i + " ");
				if (i % 2 == 1) {
					terms++;
					i = 3 * i + 1;
				}
				else if (i % 2 == 0) {
					terms++;
					i /= 2;
				}

			}
			System.out.println(terms);
			if (terms > mostTerms) {
				mostTerms = terms;
			}
		//}
	}
}
