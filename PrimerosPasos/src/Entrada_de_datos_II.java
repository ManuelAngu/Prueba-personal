import javax.swing.*;

public class Entrada_de_datos_II {

	public static void main(String[] args) {

		
		String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre"); 
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		
		int edad_usuario = Integer.parseInt(edad);//pasa el valor edad que es de String en JOptionpane
		//lo convierte a un valor Int ya se pueden hacer calculos.
		System.out.println("Hola, te llamas  " + Nombre_usuario + " y tienes " + (edad_usuario+1) + " años");
	}
	
		

}
