
public class manipula_cadenas_II {

	public static void main(String[] args) {
		String frase = "hoy es un estupendo dia para aprender a programar en java";
		
		String frase_resumen = frase.substring(0,29) + " irnos a la playa  y olvidarnos de todo y " 
		
		+ frase.substring(29, 57);
		// hay 2 sub string nosotros elegimos el que se marca (principio/fin)
		int cuenta = frase.length();
	
		System.out.println("numero total de caracteres de la frase es: " + cuenta + " y la frase es: " + frase + 
		" y su variante resumida y mas divertida es: " + frase_resumen);
}
	}