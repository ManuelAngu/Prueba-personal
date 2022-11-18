import java.util.*;
public class Entrada_de_datos_I {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu nombre, por favor");
		
		@SuppressWarnings("unused")
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("introduzca su edad,porfavor");
		
		int edad=entrada.nextInt();
		 
		edad+=3;//no se deve olvidar el =;
		
		System.out.println("el año que viene tendras " +(edad+1));
	}

}
