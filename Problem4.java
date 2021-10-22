/*	Rami Shafikov
	Euler Problem #4
	21/10/21		*/

public class Problem4 {
	public static void main(String[] args) {
		int prod, largestPal = 0;
		String pal;
		for (int i=100; i<999; i++) {
			for (int j=999; j>=i; j--) {
				prod = i*j;
				pal = Integer.toString(prod);

				//Check number length
				if (pal.length() == 6) {

					//Check for palindrome
					if (pal.charAt(0) == pal.charAt(pal.length()-1)) {
						if (pal.charAt(1) == pal.charAt(pal.length()-2)) {
							if (pal.charAt(2) == pal.charAt(pal.length()-3)) {
								if (prod > largestPal) {largestPal = prod;}
							}
						}
					}
				}
			}
		}
		System.out.println(largestPal);
	}
}
