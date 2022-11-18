import javax.swing.*;
public class Bucles_I {

	public static void main(String[] args) {
		String clave="Manolo";
		
		String pass ="";
		
while(clave.equals(pass)==false){//MIentras la Clave sea diferente a pass hemos
			//de generar un codigo dpara entrada de datos para la variable pass.
			
	pass =JOptionPane.showInputDialog("Introduce la Contraseña,Por favor");
			
if(clave.equals(pass)==false) {
			 
				System.out.println("contraseña Incorrecta");
}
}
				System.out.println("contraseña correcta");
}
}	