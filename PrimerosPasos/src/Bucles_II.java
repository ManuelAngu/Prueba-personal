import java.util.*;
public class Bucles_II {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		int aleatorio = (int)(Math.random()*100);
		
		//System.out.println(aleatorio);
		
		int numero = 0;
				
		int intentos = 0;		
		
while(numero!= aleatorio ) {
			intentos++;
			 System.out.println("introduce un numero,por favor");
			 
			 numero=entrada.nextInt();
			 
if(aleatorio<numero) {
				 
			System.out.println("el numero es menor");
					 
			 }
			 

else if (aleatorio>numero) {
	
			System.out.println("el numero es mayor");
			}
			System.out.println("correcto los has conseguido en "+intentos+" intentos");
		}
	
	}
}
