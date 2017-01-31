package teoria;

import java.util.Scanner;

/*Con este programa, vamos a leer
 * datos desde la consola
 * usando la clase Scanner
 * y comprobamos que el tipo es correcto
 */
public class ExpresionesRegulares2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce valores:");
		Scanner in = new Scanner(System.in);
		//leemos un número entero, pero como cadena
		String numeroLeido = in.next();
		String expresionRegular = "[0-9]+";
		//convertimo la cadena a número
		if (numeroLeido.matches(expresionRegular)){
			int numero = Integer.parseInt(numeroLeido);
			System.out.printf("El valor doble del número "
				+ "introducido es %d%n", numero * 2);
		} else {
			System.out.println("No has introducido un número entero");
		}
		System.out.println("introduce solo una palabra:");
		String palabra = in.next();
		expresionRegular = "[a-zA-Z]+";
		if (palabra.matches(expresionRegular))
			System.out.printf("La palabra introducida es: %s%n", palabra);
		else
			System.out.println("No has introducido una palabra");
		
		in.close();
	}

}
