/*	Rami Shafikov
	Euler Problem #5
	21/10/21		*/

public class Problem5 {

	public static void main(String[] args) {
		int guess = 21;
		int j=0;
		boolean flag = false;

		while (flag == false) {
			for (int i = 2; i<=20; i++) {
				if (guess % i == 0) {
					j++;
				}
			}
			if (j == 19) {
				System.out.println(guess);
				flag = true;
			}
			else {guess++; j=0;}
		}
	}
}
