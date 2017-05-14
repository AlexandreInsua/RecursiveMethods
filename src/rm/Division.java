package rm;

/**
 * Make division by sucesive substractions.
 * 
 * @author Alexandre Insua Moreira
 * @version 1.0, 05.03.2017
 */

public class Division {

	public static void main(String[] args) {

		System.out.println(division(20, 2));

	}

	public static int division(int a, int b) {
		if (b > a)
			// It exits when the numerator (a) is less than the denominator (b).
			return 0;
		else
			// When numerator him rest on the denominator.
			// Each time you do this consciously or increased by 1.
			// This 1 acts as a constant that is adding on
			
			return division(a - b, b) + 1;
	}

}
