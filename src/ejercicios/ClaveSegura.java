package ejercicios;

public class ClaveSegura {
	private String clave;

	public ClaveSegura(String cl) {
		if ( esClaveSegura(cl) )
			this.clave = cl;
		else
			throw new RuntimeException("No es clave segura");
	}
	public static boolean esClaveSegura(String cl){
		return cl.length() >= 8 &&
				 cl.matches(".*[a-z].*")
				&& cl.matches(".*[A-Z].*") && 
				cl.matches(".*[\\d].*") && 
				cl.matches(".*[\\W_].*")
				;
	}
	@Override
	public String toString() {
		return "ClaveSegura [clave=" + clave + "]";
	}
	/*public static void main(String[] args) {
		ClaveSegura clave = new ClaveSegura("aA12aaaaaaa_");
		System.out.println(clave);
	}*/
	
	
}
