
import javax.swing.*;
public class Bucles_III {

	public static void main(String[] args) {
		
		String genero ="";
		
		do {
			genero = JOptionPane.showInputDialog("introduce tu genero H/M: ");// el do-while hace que se repita el joption pane hasta que introduzcamos un h o m
			
		}while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")== false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Altura en cm"));
		
		int pesoideal=0;
		 
		if(genero.equalsIgnoreCase("H")) {
			
		pesoideal = altura-110;
		}
			
		else if(genero.equalsIgnoreCase("M")){
		
		pesoideal = altura-120;
		}
		
		System.out.println("tu peso ideal es: "+pesoideal);
}
}