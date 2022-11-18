import javax.swing.*;
public class Array_II_bis {

	public static void main(String[] args) {
		
		String [] paises = new String[8];
		
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce Pais");
		}
		
			for(String elemento:paises) {//el nuevo for
				 
				System.out.println("pais " +elemento);
			
		}
	}

}
