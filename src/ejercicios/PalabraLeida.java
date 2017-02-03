package ejercicios;

public class PalabraLeida {
	
	private String contenidoPalabra;
	
	public PalabraLeida(String contenidoPalabra) {
		this.contenidoPalabra = contenidoPalabra;
	}
	
	public int obtenerNumeroLetras(){
		return contenidoPalabra.length();
	}
	public boolean empiezaPorVocal(){
		return contenidoPalabra.matches("[aeiouáéíóúAEIOUÁÉÍÓÚ].*");
	}
	public boolean terminaPorVocal(){
		return contenidoPalabra.matches(".*[aeiouáéíóúAEIOUÁÉÍÓÚ]");
	}
	public int contarNumeroVocales(){
		int contador = 0;
		for ( int i = 0; i < contenidoPalabra.length(); i++ ) {
			if ( (""+contenidoPalabra.charAt(i)).
					matches("[aeiouáéíóúAEIOUÁÉÍÓÚüÜ]") )
				contador++;
		}
		return contador;
	}
	public boolean contieneH(){
		return contenidoPalabra.toLowerCase().contains("h");
			
	}
	
	public boolean sonIguales(String palabra){
		return contenidoPalabra.equals(palabra);
	}
	
	public boolean esPalindromo(){
		StringBuilder sBuilder = new StringBuilder(contenidoPalabra);
		String palabraAlReves = sBuilder.reverse().toString();
		return contenidoPalabra.equals(palabraAlReves);
	}
	
	@Override
	public String toString() {
		return contenidoPalabra;
	}
	
}
