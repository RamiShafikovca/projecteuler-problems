/*	Rami Shafikov
	Euler Problem #3
	21/10/21		*/

public class Problem3 {
	static long biggestFactor = 0;
	public static void main(String[] args) {
		long num = 317584931803l;
		boolean isItPrime;

		divideNum(num);
		//divide number into prime factors
		System.out.println(biggestFactor);

	}

	/* Method to find break number into factors, if factor isn't prime, break factor into primes
	   If Number is larger than greatest factor so far, replace it */
	public static long divideNum(long number) {
		while (!isPrime(number)) {
			for (int i = 2; i<=Math.sqrt(number); i++) {
				if (number % i == 0) {
					number /= i;
					if (isPrime(i)) {
						if (i > biggestFactor) {
							biggestFactor = i;
						}
					}
					else {divideNum(i);}
				}
			}
			if (number > biggestFactor) {
				biggestFactor = number;
			}
		}
		return biggestFactor;
	}

	//method to check if number is prime
	public static boolean isPrime(long number) {
		for (int i = 2; i<=Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
