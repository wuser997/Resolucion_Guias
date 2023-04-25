package guia_3_Ejercicios;

public class Ejercicio_Guia_3_1c {

	public static void main(String[] args) {

		int num_x = 7;

		int acumulador = 0;

		int vector_final[] = { 4,4,4,4,6,6,7,7,7,7,7,7,10,0,0};

		for (int i = 0; i < vector_final.length; i++) {
			if (vector_final[i] == num_x) {

				acumulador = acumulador + vector_final[i];
			}
		}

		if (acumulador != 0) {
			System.out.print("El resultado de sumar todos los números " + num_x + " encontrados es " + acumulador+".");
		} else {
			if (num_x != 0) {
				System.out.print("El número " + num_x + " no se encontró en el arreglo.");
			} else {
				System.out.print("El resultado es cero porque el número buscado es el cero.");
			}
		}
	}
}
