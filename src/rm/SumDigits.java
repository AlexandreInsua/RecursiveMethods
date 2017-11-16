package rm;

public class SumDigits {

	public static void main(String[] args) {

		System.out.println(sumDigits(123));

	}
	
	static public int sumDigits(int n){
		 
				if (n == 0)      //caso base
				    return n;
				else
				    return sumDigits (n / 10) + (n % 10);
			    }

}
