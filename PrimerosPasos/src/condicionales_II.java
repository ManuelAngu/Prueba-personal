
import java.util.Scanner;

public class condicionales_II {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad ");
		
		int edad = entrada.nextInt();
		
		if(edad<18) {
			System.out.println("eres adolescente");
		}
		
		else if(edad<40) {
			
			System.out.println("eres un adulto");
		}
		
		else if(edad<60) {
			
			System.out.println("Eres Maduro");
		}
		
		else {
			System.out.println("cuidate");
		}
	}

}