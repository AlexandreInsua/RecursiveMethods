package rm;

public class Value {

	public static int metodo(int valor) {
		if (valor <= 1) {
			return valor + 1;
		} else {
			return valor + metodo((valor / 2) % 3);
		}
	}

	public static void main(String[] args) {
		System.out.println(metodo(113));
		// Dá 117

	}
}
