package rm;

public class AcumulatedSum {

	/**
	 * This method performs a cumulative sum of an array.
	 * @param list Array of integer numbers.
	 * @param n length of array.
	 * @return integer.
	 */
	public static int method(int[] array, int n) {
		if (n > 0) {
			int tmp = 0;
			for (int i = 0; i < n; i++) {
				tmp += array[i];
			}
			return tmp + method(array, n - 1);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] list = new int[] { 1, 2, 3, 4 };
		System.out.println(method(list, 4));

		list = new int[] { 1, 2, 3, 4,5 };
		System.out.println(method(list, 5));
		
		list = new int[] { 1, 2, 3, 4,5,6};
		System.out.println(method(list, 6));
	}
}
