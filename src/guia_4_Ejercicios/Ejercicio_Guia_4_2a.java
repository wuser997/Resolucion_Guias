package guia_4_Ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//---Formato del Archivo txt a implementar----//
//  5
//  6
//  -10
//  sumar o multiplicar
//--------------------------------------------//

public class Ejercicio_Guia_4_2a {

	public static void main(String[] args) {

		String aux_args = "";

		aux_args = args[0];

		int[] vec = new int[4];

		String parametro = "";

		try {

			int i = 0;

			Path direccion_archivo = Paths.get(aux_args);

			for (String linea : Files.readAllLines(direccion_archivo)) {
				if (i < vec.length - 1) {

					vec[i] = Integer.parseInt(linea);

				} else {

					parametro = linea;
				}
				i = i + 1;
			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		sumar_o_multiplicar_imprimir(vec, parametro);

	}// fin del método main

	private static void sumar_o_multiplicar_imprimir(int[] vec, String parametro) {
		int resultado_aux = 0;

		if (parametro.equals("sumar")) {

			for (int i = 0; i < vec.length; i++) {
				resultado_aux = resultado_aux + vec[i];
			}

			imprime_suma(resultado_aux);

		} else if (parametro.equals("multiplicar")) {

			resultado_aux = vec[0] * vec[1] * vec[2];

			imprime_multiplicar(resultado_aux);

		} else {

			imprime_error();
		}

	}// fin del método sumar_o_multiplicar_imprimir

	private static void imprime_suma(int resultado) {
		System.out.print("La SUMA de los números ingresados es igual a " + resultado);
	}

	private static void imprime_multiplicar(int resultado) {
		System.out.print("El PRODUCTO de los números ingresados es igual a " + resultado);
	}

	private static void imprime_error() {
		System.out.print("Debe ingresar el párametro \"sumar\" o \"multiplicar\"");
	}

}// fin de la clase
