package guia_4_Ejercicios;

//Ejecutar de esta forma ==>>java -jar Ejercicio_Guia_4_1a.jar 3 5 6 a
//Ejecutar de esta forma ==>>java -jar Ejercicio_Guia_4_1a.jar 3 8 -3 d

public class Ejercicio_Guia_4_1a {

	public static void main(String[] args) {

		if (args.length > 0) {

			int vector_num[] = new int[3];
			int vector_ordenado[] = new int[3];
			String orden;
			char centinela = 'd';

			for (int i = 0; i < args.length; i++) {
				if (i == args.length - 1) {

					centinela = args[i].charAt(0);

				} else {
					vector_num[i] = Integer.parseInt(args[i]);

				}
			}

			if (centinela == 'd') {

				orden = "descendente";

			} else {

				orden = "ascendente";
			}

			vector_ordenado = ordenar(vector_num, orden);

			System.out.print(imprimir(vector_num, vector_ordenado, orden));

		} else {

			System.out.print("No se ingresaron los argumentos");

		}

	}// fin main

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
	}// fin del método ordenar

	private static String imprimir(int vector_num[], int vector_ordenado[], String orden) {

		String t1 = "";
		String t2 = "";
		String t3 = "";
		String t4 = "";
		String t5 = "";
		String t6 = "";
		String t7 = "";
		String t8 = "";

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

		return t5 + t6 + t7 + t8;

	}// fin imprimir

} // fin de clase
