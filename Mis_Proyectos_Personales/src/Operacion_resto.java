import java.util.Scanner;

public class Operacion_resto {

	public static void main(String[] args) {
	 int a;
	 
	 @SuppressWarnings("resource")
	Scanner entrada = new Scanner (System.in);
	 
	 System.out.println("introduce un numero ");
	
	 a = entrada.nextInt();	 
	 
	

if( a % 2 == 0) {
	
	System.out.println("este numero es par ");
	
}	
	
	
else {
	
	System.out.println("este numero es impar ");
}
}
}
