package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestClaves {

	public static void main(String[] args) {
		List<Integer> listaTamano = new ArrayList<Integer>();
		final String  FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIj"
				+ "JkKlLmMnNñÑoOpPqQrRsStTuUvVwW"
				+ "xXyYzZ0123456789¿?()=@.:,;!¡&{}";
		//generar una lista dinámica de 10 tamaños de las futuras
		//claves
		for (int i = 0; i < 10; i++){
			int tamano = (int) (Math.random()*101);
			listaTamano.add(tamano);
		}
		System.out.println(listaTamano);

	}

}
