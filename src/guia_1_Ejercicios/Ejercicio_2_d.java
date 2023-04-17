package guia_1_Ejercicios;

public class Ejercicio_2_d {

	public static void main(String[] args) {

		float imt;// ingresos_mensuales_totales

		int cv; // cantidad_vehiculos con una antigüedad menor a 5 años

		int inmuebles;

		int embarcaciones;

		int adl; // aeronave_de_lujo

		boolean as; // activos_societarios

		imt = 100.000f;
		cv = 0;
		inmuebles = 1;
		embarcaciones = 0;
		adl = 0;
		as = false; // Si el individuo posee activos societarios entonces la variable "as" se
					// inicializa con el valor "true" en caso contrario con "false"

		System.out.println(segmento(imt, cv, inmuebles, embarcaciones, adl, as));

	}

	private static String segmento(float imt, int cv, int inmuebles, int embarcaciones, int adl, boolean as) {

		String mensaje;

		if ((imt >= 489.083f) || (cv >= 3) || (inmuebles >= 3) || (embarcaciones >= 1) || (adl >= 1) || as) {

			mensaje = "El individuo SI pertenece al segmento de ingresos altos.";

		} else {

			mensaje = "El individuo NO pertenece al segmento de ingresos altos.";
		}

		return mensaje;
	}
}
