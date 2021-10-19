package euler;

public class Problem7 {

	public static void main(String[] args) {
		int primeCount = 2;
		int i = 2;
		boolean isprime;
		while (primeCount < 100) {
			i++;
			isprime = IsPrime(i);
			if (isprime == true) {
				System.out.println(i + " is prime");
				primeCount++;
			}
		}
		System.out.print(i);
	}



	public static boolean IsPrime(int i) {
		for (int j=2; j<(i/2)+1; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
