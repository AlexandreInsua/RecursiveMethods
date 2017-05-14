package rm;

public class ComplexSum {

	public static void complexSum(int a, int b) {
		int m = a + b;
		if (m <= 10) {
			complexSum(m, b + 1);
			complexSum(m + 1, b + 1);
		}
		sum(m, a);
	}

	public static void sum(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}

	
	public static void main(String[] args) {

		complexSum(3,3);
	}

}
