//Alumno: Campos Walter

package guia_3_Ejercicios;

public class Ejercicio_Guia_3_1a {

	public static void main(String[] args) {

		String p1 = "hola que tal";

		char unaLetra = 'a'; // en la variable unaLetra se almacena la letra cuya
							 // aparición se quiere contar en un dado String

		int apariciones = 0;

		apariciones = cuenta_apariciones(p1, unaLetra);

		if (apariciones == 0) {
			System.out.println("La letra " + "\"" + unaLetra + "\"" + " no aparece.");
		} else if (apariciones == 1) {
			System.out.println("La letra " + "\"" + unaLetra + "\"" + " aparece una vez.");
		}

		else {
			System.out.println("La letra " + "\"" + unaLetra + "\"" + " aparece " + apariciones + " veces.");

		}

	}

	// METODO QUE CUENTA LAS APARICIONES
	private static int cuenta_apariciones(String palabra, char letra) {

		char vectorDeChars[];

		vectorDeChars = palabra.toCharArray();

		int contador = 0;

		for (int i = 0; i < palabra.length(); i++) {
			if (vectorDeChars[i] == letra) {
				contador += 1;

			}
		}
		return contador;
	}

}