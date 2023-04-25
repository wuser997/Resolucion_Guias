package guia_3_Ejercicios;

public class Ejercicio_Guia_3_1b {

	public static void main(String[] args) {

		int vector_num[] = new int[3];
		int vector_ordenado[] = new int[3];

		vector_num[0] = 1;
		vector_num[1] = 2;
		vector_num[2] = 3;

		// ascendente
		// descendente

		String orden = "descendente"; //Seleccione "ascendente" o "descendente"
		vector_ordenado = ordenar(vector_num, orden);

		System.out.print(imprimir(vector_num, vector_ordenado, orden));

	}

	// POR DEFECTO EL METODO ORDENA LOS NÚMEROS 
	// DE UN VECTOR EN FORMA DECRECIENTE
	private static int[] ordenar(int vec[], String orden) {

		int vec_temp[] = new int[3];
		int aux_temp[] = new int[3];

		if (vec[0] >= vec[1]) {

			if (vec[1] >= vec[2]) {

				vec_temp[0] = vec[0];
				vec_temp[1] = vec[1];
				vec_temp[2] = vec[2];

			} else {

				if (vec[0] <= vec[2]) {

					vec_temp[0] = vec[2];
					vec_temp[1] = vec[0];
					vec_temp[2] = vec[1];

				} else {

					vec_temp[0] = vec[0];
					vec_temp[1] = vec[2];
					vec_temp[2] = vec[1];
				}
			}

		} else {

			if (vec[1] <= vec[2]) {

				vec_temp[0] = vec[2];
				vec_temp[1] = vec[1];
				vec_temp[2] = vec[0];

			} else {

				if (vec[0] <= vec[2]) {

					vec_temp[0] = vec[1];
					vec_temp[1] = vec[2];
					vec_temp[2] = vec[0];

				} else {

					vec_temp[0] = vec[1];
					vec_temp[1] = vec[0];
					vec_temp[2] = vec[2];
				}
			}
		}

		if (orden == "ascendente") {
			aux_temp[0] = vec_temp[2];
			aux_temp[1] = vec_temp[1];
			aux_temp[2] = vec_temp[0];
		} else {
			aux_temp = vec_temp;
		}

		return aux_temp;
	}

	
	//METODO IMPRIME MENSAJE
	private static String imprimir(int vector_num[], int vector_ordenado[], String orden) {

		String t1 = "";
		String t2 = "";
		String t3 = "";
		String t4 = "";
		String t5 = "";
		String t6 = "";
		String t7 = "";
		String t8 = "";
		String t9 = "";

		for (int i = 0; i < vector_num.length; i++) {
			if (i == 0) {
				t1 = "Luego de aplicar el método ";

				if (orden == "ascendente") {
					t2 = "ASCENDENTE al vector de entrada [" + Integer.toString(vector_num[i]);
				} else {
					t2 = "DESCENDENTE al vector de entrada [" + Integer.toString(vector_num[i]);
				}

			} else if (i == 1) {
				t3 = "," + Integer.toString(vector_num[i]);
			} else {
				t4 = "," + Integer.toString(vector_num[i]) + "] él mismo queda de la siguiente manera ";

			}
		}
		
		t5 = t1 + t2 + t3 + t4;
		
		for (int i = 0; i < vector_ordenado.length; i++) {
			if (i == 0) {
				t6 = "[" + Integer.toString(vector_ordenado[i]);
			} else if (i == 1) {
				t7 = "," + Integer.toString(vector_ordenado[i]);
			} else {
				t8 = "," + Integer.toString(vector_ordenado[i]) + "].";
			}
		}
		
		return t9=t5+t6+t7+t8;

	}

}
