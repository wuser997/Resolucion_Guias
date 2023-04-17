package guia_1_Ejercicios;

public class Ejercicio_1_c {

	public static void main(String[] args) {
		int valor_inicial = 4;
		int valor_final = 12;
		String par_o_impar = "par";

		if (par_o_impar == "par") {
			while (valor_inicial <= valor_final) {
				if ((valor_inicial % 2) == 0) {
					System.out.print(valor_inicial+"  ");
				}
				valor_inicial = valor_inicial + 1;
			}

		} else if (par_o_impar=="impar") {
			while (valor_inicial <= valor_final) {
				if ((valor_inicial % 2) != 0) {
					System.out.print(valor_inicial+"  ");
				}
				valor_inicial = valor_inicial + 1;
			}
		}else {
			System.out.print("ERROR, Ingrese \"par\" o \"impar\"");
		}
	}
}