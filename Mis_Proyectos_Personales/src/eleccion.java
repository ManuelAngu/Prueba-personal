import java.util.Scanner;

public class eleccion {
	
	public static void main(String[] args) {
	
		
	@SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("introduce la base");
	
	int base = entrada.nextInt();
	
	System.out.println("introduce la altura");
	
	int altura = entrada.nextInt();
	
	System.out.println("el area del rectangulo es: "+ (base*altura));
	
	
	
	
}
}