package guia_4_Ejercicios;

import java.util.Scanner;

public class Ejercicio_Guia_4_1b {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Scanner otro_scn = new Scanner(System.in);

		int vector_num[] = new int[3];
		int vector_ordenado[] = new int[3];

		char centinela = ' ';

		String orden;

		int i = 0;

		do {

			if (i == 0) {

				System.out.println("INGRESE UN NÚMERO");

				vector_num[i] = scn.nextInt();

			} else if (i >= 1 && i <= 2) {

				System.out.println("INGRESE OTRO NÚMERO");

				vector_num[i] = scn.nextInt();

			} else {
				System.out.println("INGRESE LA LETRA \"a\" O \"d\" ");
				centinela = otro_scn.nextLine().charAt(0);

			}

			i = i + 1;

		} while (i <= 3);

		if (centinela == 'd') {

			orden = "descendente";

		} else {

			orden = "ascendente";
		}

		vector_ordenado = ordenar(vector_num, orden);

		System.out.print(imprimir(vector_num, vector_ordenado, orden));

	}// fin del main

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
	}// fin método ordenar

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

	}// fin método imprimir

}
