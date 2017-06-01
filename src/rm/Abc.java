package rm;

public class Abc {

	public static int metodo(int valor) {
		if (valor <= 1) {
			return valor + 1;
		} else {
			return valor + metodo((valor / 2) % 3);
		}
	}

	public static void main(String[] args) {
		System.out.println(metodo(213));
		System.out.println(metodo(113));
		System.out.println(metodo(6));
		System.out.println(metodo(5));
		System.out.println(metodo(4));
		System.out.println(metodo(3));
		System.out.println(metodo(2));
		System.out.println(metodo(1));
		
	}

}
