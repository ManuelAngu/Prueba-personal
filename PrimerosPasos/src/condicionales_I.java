import java.util.Scanner;

public class condicionales_I {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad ");
		
		int edad = entrada.nextInt();
		
		if(edad>=18) {//en el if metemos el condicional con la variable que condicionamos
						//recuerda la llave
			System.out.println("Eres mayor de edad ");
		}
		
		else {
			System.out.println("Eres menor de edad ");
		}// el else no requiere condicion pq solo hay una variable
		//o es si o es no ,este es un caso de solo 2 opciones
	}

}
