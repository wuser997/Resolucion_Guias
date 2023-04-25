package guia_4_Ejercicios;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//-------------------------ORDEN DE LOS PARAMETROS-------------------------------//

//..\eclipse-workspace\texto_ENTRADA.txt 1 c ..\eclipse-workspace\texto_SALIDA.txt 

//--------------------------------------------------------------------------------//



public class Ejercicio_Guia_4_3 {

	public static void main(String[] args) {

		String abecedario = " abcdefghijklmnñopqrstuvwxyz";

		String ruta_entrada = new String(args[0]);

		int desplazamiento = Integer.valueOf(args[1]);

		char cod_o_dec = args[2].charAt(0);

		String ruta_salida = new String(args[3]);

		String mensaje = new String(lee_texto(ruta_entrada));

		elegir_cod_o_dec(abecedario, mensaje, desplazamiento, cod_o_dec, ruta_salida);

	}// fin del método main

	private static void elegir_cod_o_dec(String abecedario, String mensaje, int desplazamiento, char cod_o_dec,
			String ruta_salida) {

		char[] salida_codificada;

		char[] salida_decodificada;

		if (cod_o_dec == 'c') {

			salida_codificada = codificar(abecedario, mensaje, desplazamiento);

			String salida_codificada_a_String = new String(salida_codificada);

			salida_decodificada = decodificar(abecedario, salida_codificada_a_String, desplazamiento);

			String salida_decodificada_a_String = new String(salida_decodificada);

			if (mensaje.equals(salida_decodificada_a_String)) {

				escribe_archivo_salida(ruta_salida, salida_codificada_a_String);

				System.out.println("La salida codificada fue escrita correctamente en el arhivo especificado");
				System.out.println(salida_codificada);

			}

		} else {

			salida_decodificada = decodificar(abecedario, mensaje, desplazamiento);

			String salida_decodificada_a_String = new String(salida_decodificada);

			salida_codificada = codificar(abecedario, salida_decodificada_a_String, desplazamiento);

			String salida_codificada_a_String = new String(salida_codificada);

			if (mensaje.equals(salida_codificada_a_String)) {

				escribe_archivo_salida(ruta_salida, salida_decodificada_a_String);
				System.out.println("La salida decodificada fue escrita correctamente en el arhivo especificado");
				System.out.println(salida_decodificada);

			}

		}

	}// fin del método elegir_cod_o_dec

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

	private static String lee_texto(String ruta) {

		String texto = new String();

		try {

			Path direccion_archivo = Paths.get(ruta);

			for (String linea : Files.readAllLines(direccion_archivo)) {

				texto = linea;

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		return texto;

	}// fin del método lee_parametros

	private static void escribe_archivo_salida(String ruta_salida, String salida_cod_dec_String) {

		Path direccion_archivo = Paths.get(ruta_salida);

		try {

			Files.write(direccion_archivo, salida_cod_dec_String.getBytes(StandardCharsets.UTF_8));

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}// fin de la clase
