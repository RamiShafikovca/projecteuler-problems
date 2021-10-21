/*	Rami Shafikov
	Euler Problem #2
	21/10/21		*/

public class Problem2 {
	public static void main(String[] args) {
		int fib = 1, fib2 = 2, temp, sum = 0;
		//while fib number is less than 4 million run sequence and add all even fib numbers
		while (fib2 < 4000000) {
			if (fib2 % 2 == 0) {sum += fib2;}
			temp = fib2;
			fib2 = fib + fib2;
			fib = temp;
		}
		System.out.println(sum);
	}
}
