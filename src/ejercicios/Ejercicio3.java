package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		//Lista para aquellos nombre que comienzan por A
		List<String> listaComienzaPorA = 
				new ArrayList<String>();
		//Lista para aquellos nombre que no acaben en vocal
		List<String> listaAcabanEnConsonante = 
				new ArrayList<String>();
		// Leemos los datos desde el fichero nombres_mujer.txt
		//usamos la clase Scanner
		 
		try ( Scanner in = new Scanner(new File("nombres_mujer.txt"));
 )		{
			int contador = 0;
			while (in.hasNextLine()){
				String palabra = in.nextLine();
				if ( palabra.startsWith("a") )
					listaComienzaPorA.add(palabra);
				if ( palabra.matches(".*[^aeiou]$"))
					listaAcabanEnConsonante.add(palabra);
				contador++;
			}
			System.out.println("Nº palabras leidas: " + contador);
			System.out.println(listaComienzaPorA);
			System.out.println(listaAcabanEnConsonante);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No encuentro el archivo");
		} 
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en programa: " + 
					(fin - inicio) + " milisegundos");

	}

}
