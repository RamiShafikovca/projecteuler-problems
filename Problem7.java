/*	Rami Shafikov
	Euler Problem #7
	21/10/21		*/

public class Problem7 {

	public static void main(String[] args) {
		int primeCount = 1;
		int num = 1;
		while (primeCount < 10002) {
			num++;
			if (IsPrime(num)) {
				//System.out.print(num + " is prime\t");
				primeCount++;
			}
		}
		System.out.println(num);
	}

	//method to check if number is prime
	public static boolean IsPrime(int num) {
		for (int j=2; j<=Math.sqrt(num); j++) {
			if (num % j == 0) {return false;}
		}
		return true;
	}
}
