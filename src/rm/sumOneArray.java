package rm;

public class sumOneArray {

	public static int method(int[] list, int n) {
		if (n > 0) {
			int tmp = 0;
			for (int i = 0; i < n; i++) {
				tmp += list[i];
			}
			return tmp + method(list, n - 1);
		} else
			return 0;
	}

	public static void main(String[] args) {
		int[] list = new int[] { 1, 2, 3, 4 };
		System.out.println(method(list, 4));
		// Suma 20
	}
}
