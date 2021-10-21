/*	Rami Shafikov
	Euler Problem #10
	October 19 2021		*/

public class Problem10 {
	public static void main(String[] args) {
		boolean prime;
		long sumOfPrimes = 0;
		//iterate through each integer below 2 million
		for (int i=2; i<2000000; i++) {
			prime = isPrime(i);
			if (prime == true) {
				sumOfPrimes += i;
			}
		}
		System.out.println(sumOfPrimes);
	}

	//method to determine if an integer "n" is prime or not by checking if it's a multiple of 2 through sqrt(n)
	static boolean isPrime(int i) {
		for (int j=2; j<=(int) (Math.sqrt(i)); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
