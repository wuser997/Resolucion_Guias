package guia_1_Ejercicios;

public class Ejercicio_1_d {

	public static void main(String[] args) {
		
		int valor_inicial = 5;
		int valor_final = 11;

		for (int i = valor_final; i >= valor_inicial; i--) {
			if ((i % 2) == 0) {
				System.out.print(i+"  ");
			}
		}
	}
}
