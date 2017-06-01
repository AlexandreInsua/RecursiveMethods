package rm;

public class sumOneArray2 {

	public static float metodo1(float[] lista) {
		float[] lista2;
		if (lista.length > 1) {
			lista2 = new float[lista.length - 1];
			System.arraycopy(lista, 1, lista2, 0, lista2.length);
			return lista[0] + metodo1(lista2);
		} else
			return lista[0];
	}

	public static void main(String[] args) {
		float miLista[] = { 1.0F, 3.0F, 3.2F };
		System.out.println(metodo1(miLista));
	}
}
