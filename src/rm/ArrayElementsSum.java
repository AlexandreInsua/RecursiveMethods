package rm;

public class ArrayElementsSum {

	/*
	 * arraycopy: copia unha matriz a partir de outra dada, comenzando nunha
	 * posición dada a unha posición determinada. Recibe como parámetros a array
	 * orixe, a posición de orixe, a array destino e a posición destino e a
	 * lonxitude.
	 * 
	 */
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

		// É unha especie de recursivo. Suma as tres posicións: 7.2f
		
		float miLista3[] = { 1.0F, 3.0F, 3.2F, 1.0f };
		System.out.println(metodo1(miLista3));

	}
}
