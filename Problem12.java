/*	Rami Shafikov
	Euler Problem #12
	21/10/21		*/

public class Problem12 {
	public static void main(String [] args) {
		int divisors=0, inc = 2;
		long triNum = 1;
		int largestDivisors = 0;

		while (divisors <= 500) {
			divisors = 1;
			triNum += inc;
			inc++;
			for (int i=1; i <= Math.sqrt(triNum); i++) {
				if (triNum % i == 0) {
					divisors += 2;
				}
			}
			//case that the number is a perfect square
			if ((int) (Math.sqrt(triNum)) * (int) (Math.sqrt(triNum)) == triNum) {divisors--;}
		}
		System.out.println(triNum);
	}
}
