package rm;


public class Fibonacci {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
	System.out.println(fibonacci(100));
		System.out.println("\n\nFin de programa");
		System.out.printf("Time: %d ms\n", System.currentTimeMillis() - start);
	}

	private static int fibonacci(int num) {
		int n = num;
		if ((n == 1) || (n == 0)) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

}
