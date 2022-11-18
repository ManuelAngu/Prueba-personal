import javax.swing.JOptionPane;

public class Entrada_de_datos_III {

	public static void main(String[] args) {
				//double x = 10000.0;
				
				//System.out.printf("%1.2f",x/3);//limita el numero de decimales
				
				String num1 = JOptionPane.showInputDialog("Introduce un numero");
				
				double num2 = Double.parseDouble(num1);//CLASE double con su metod parse double,al ser sqrt
				//se neceistaba un double,(repetimos te cambia el string de JOp a un doble)
				
				System.out.print(" raiz cuadrada de "+ num2 + " es: ");
				
				System.out.printf("%1.2f",Math.sqrt(num2));//ese comando limita el numero de decimales que se muestran)
				
				
	} 
}
