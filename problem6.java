package euler;

public class problem6 {
	public static void main(String[] args) {
		long sumOfSquares=0;
		long squareOfSum=0;
		
		for (int i=1; i<=100; i++) {
			sumOfSquares += (i*i);
			squareOfSum += i;
		}
		
		squareOfSum = squareOfSum * squareOfSum;
		System.out.println(squareOfSum - sumOfSquares);
	}
}
