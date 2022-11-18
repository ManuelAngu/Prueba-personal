
//Importamos el paquete con todas las clases de java.io//
import java.io.*;
//creamos la clase fichero//
public class Fichero{
	public static String Fichero;
	FileReader fr = null;
	BufferedReader br = null;
	
//Creamos el metodo leer, recibe el nombre archivo y lo muestra en pantallas//
	
public void  leer (String nombre) {
		File archivo = new File ("C:\\" + nombre + ".txt");
		try {
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String l = "";
			while((l=br.readLine())!=null){
				System.out.println(l);
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2) {
			e2.printStackTrace();
		}
	}
//Creamos metodo estadistica que recibe el nombre de archico y muesta el numero de lineas y caracteres//
public void  estadistica (String nombre) {
		File archivo = new File ("C:\\" + nombre + ".txt");
		try {
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String l = "";
			int numeroLineas = 0;	
			int numeroCaracteres = 0;
			while((l=br.readLine())!=null){ 
				numeroLineas ++;
				numeroCaracteres += l.length(); 
				
				}
			System.out.println("numero de lineas: " +numeroLineas);
			System.out.println("numero de caracteres: "+numeroCaracteres);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2) {
			e2.printStackTrace();
		}
		}
	
	public static void main (String [ ] args) {
		Fichero fichero = new Fichero();
		fichero.leer("Fichero");
		fichero.estadistica("Fichero");}}
		
		
	
	