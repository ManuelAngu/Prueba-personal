
public class Manipula_cadenas_I {

	public static void main(String[] args) {
		
		String mi_frase = "hola pepe";
		
		System.out.println("mi frase es: " + mi_frase);
		
	
		System.out.println("mi frase tiene " + mi_frase.length()+ " letras");
		
		System.out.println("la primera letra de mi frase es: " + mi_frase.charAt(0));
		/*charat nos devuelve el caracter 
		de la posicion que elijamos*/
		
		int ultima_letra;
		
		ultima_letra = mi_frase.length();
		
		System.out.println("y la ultima letra de mi frase es: "+ mi_frase.charAt(ultima_letra-1));
		
		//le introducimos al metodo charat el calculo de la variable int que hemos introducido -1
	}	//el metodo lenght nos devuelve  un numero por eso se declara el tipo de dato int y se puede poner menos 1
	
	
	
	

}
