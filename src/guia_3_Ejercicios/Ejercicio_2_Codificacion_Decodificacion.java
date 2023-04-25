package guia_3_Ejercicios;

public class Ejercicio_2_Codificacion_Decodificacion {

	public static void main(String[] args) {

		String abecedario = " abcdefghijklmnñopqrstuvwxyz";

		String mensaje = "aaa  aaaz ñ o pqer";

		int desplazamiento = 3; // 0<=desplazamiento<=28 INTERVALO DEL DESPLAZAMIENTO

		char[] salida_codificada;

		char[] salida_decodificada;

		salida_codificada = codificar(abecedario, mensaje, desplazamiento);

		String salida_codificada_string = new String(salida_codificada);

		salida_decodificada = decodificar(abecedario, salida_codificada_string, desplazamiento);

		System.out.println(salida_codificada);

		System.out.println(salida_decodificada);

	}// fin del método main

	private static char[] codificar(String abecedario, String mensaje, int desplazamiento) {

		char tempmensaje[];

		char guardo_mensaje[];

		tempmensaje = mensaje.toCharArray();

		guardo_mensaje = mensaje.toCharArray();

		int posicion = 0; // POSICION

		for (int i = 0; i < tempmensaje.length; i++) {

			posicion = abecedario.indexOf(tempmensaje[i]);

			if ((posicion + desplazamiento) < abecedario.length()) {

				guardo_mensaje[i] = abecedario.charAt(posicion + desplazamiento);
			}

			else {
				posicion = posicion + desplazamiento - abecedario.length();

				guardo_mensaje[i] = abecedario.charAt(posicion);
			}
		} // fin del FOR

		return guardo_mensaje;

	}// fin método codificar

	private static char[] decodificar(String abecedario, String mensaje, int desplazamiento) {
		char tempmensaje[];

		char guardo_mensaje[];

		tempmensaje = mensaje.toCharArray();

		guardo_mensaje = mensaje.toCharArray();

		int posicion = 0; // POSICION

		for (int i = 0; i < tempmensaje.length; i++) {

			posicion = abecedario.indexOf(tempmensaje[i]);

			if ((posicion - desplazamiento) >= 0) {

				guardo_mensaje[i] = abecedario.charAt(posicion - desplazamiento);
			}

			else {
				posicion = abecedario.length() + posicion - desplazamiento;

				guardo_mensaje[i] = abecedario.charAt(posicion);
			}
		} // fin del FOR

		return guardo_mensaje;

	}// fin del método decodificar
}
