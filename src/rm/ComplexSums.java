package rm;

public class ComplexSums {

	public static void recursive(int a, int b) {
		int m = a + b;
		if (m <= 10) {
			recursive(m, b + 1);
			recursive(m + 1, b + 1);
		}
		toSum(m, a);
	}

	public static void toSum(int a, int b) {
		System.out.println("sum:" + (a + b));
	}

	public static void main(String[] args) {
		recursive(3, 3);
	}
}
