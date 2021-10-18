package euler;

public class problem9 {
	public static void main(String[] args) {
		double sum = 0;
		int prod, b, a;
		double c;
		for (b = 1; b<1000; b++) {
			for (a = 1; a<b; a++) {
				c = Math.sqrt(a*a + b*b);
				sum = a+b+c;
				if (Math.abs(sum - 1000) < 0.0001) {
					System.out.printf("a is %d, b is %d, c is %d, and the product is %d%n", a, b, (int)(c), (int)(a*b*c));
				}
			}
		}
	}
}
