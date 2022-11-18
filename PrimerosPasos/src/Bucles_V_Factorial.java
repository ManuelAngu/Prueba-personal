import javax.swing.*;
public class Bucles_V_Factorial {
	
	public static void main(String[] args) {
		
		//int resultado = 1;//para que no falle el programa al dar nuemeros muy grandes podemos usar Long
		long resultado = 1l;//recuerda lo de la l al numero declarado en long
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("introdocue un numero"));
		
		for(int i=numero;i>0;i--) {
			
			 resultado = resultado*i;
		}
		System.out.println("resultado factorial de " + numero +" es "+ resultado);
		//el bucle va pasando la variable numero, menos 1 cada vez con lo cual el valor de i se va cambiando y el resultado 
		//se multiplica por el nuevo valor de i asi hasta que se topa con la condicion i>0
}
	
}