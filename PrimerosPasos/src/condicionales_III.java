
import java.util.*;
import javax.swing.*;
public class condicionales_III {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("elige una opcion: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo \n4:Circulo");// "\n" es  para un salto de linea
 	
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			
			int lado =Integer.parseInt(JOptionPane.showInputDialog("intruduce el lado")); //integer.parse int clase estatica,y el JOption entre parentesis todo el resto
			
			System.out.println("el area del cuadrado es:"+(lado*lado));
			
			break;
			
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("intruduce la base"));
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("intruduce la altura"));

			System.out.println("el area del rectangulo es: "+(base*altura));
			
			break;
			
		case 3:
			
			double basetri = Integer.parseInt(JOptionPane.showInputDialog("intruduce la base del triangulo"));
			
			double alturatri = Integer.parseInt(JOptionPane.showInputDialog("intruduce la altura del triangulo"));
			
			System.out.println("el area del Triangulo  es: "+(basetri*alturatri/2));
			
			break;
			
		case 4:
			
			
			 double radio = Integer.parseInt(JOptionPane.showInputDialog("intruduce el radio del circulo"));
			  
			 radio = Math.pow(radio, 2);
			 
			 System.out.print("el area del circulo es: ");
			 
			 System.out.printf("%1.2f", (Math.PI*radio));
			 
			 break;
			 
			 default:
				 
				 System.out.println("La opcion no es correcta");
			 
			 
			 
			 
	}
	}
}
	
	
