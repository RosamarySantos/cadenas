package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestClaves {

	public static void main(String[] args) {
		final String  FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIj"
				+ "JkKlLmMnNñÑoOpPqQrRsStTuUvVwW"
				+ "xXyYzZ0123456789¿?()=@.:,;!¡&{}";
		//generamos el tamaño de la clave
		int tamano = (int) (Math.random() * 
				FUENTE_CARACTERES.length());
		System.out.println("Tamaño: " + tamano);
		//generamos la clave
		String clave = "";
		for (int i = 0; i < tamano ; i++ ){
			int posicion = (int) (Math.random() * 
					FUENTE_CARACTERES.length());
			clave += FUENTE_CARACTERES.charAt(posicion);
		}
		System.out.println("CLAVE GENERADA: " + clave);
		ClaveSegura claveSegura = new ClaveSegura(clave);
		System.out.println(claveSegura);

	}

}
