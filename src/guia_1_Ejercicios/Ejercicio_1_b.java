package guia_1_Ejercicios;

public class Ejercicio_1_b {

	public static void main(String[] args) {
		int valor_inicial = 3;
		int valor_final = 13;

		while (valor_inicial <= valor_final) {

			if ((valor_inicial % 2) == 0) {
				System.out.print(valor_inicial+"  ");
			}

			valor_inicial = valor_inicial + 1;
		}
	}
}
