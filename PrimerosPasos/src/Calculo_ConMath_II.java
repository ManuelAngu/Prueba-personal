
public class Calculo_ConMath_II {

	public static void main(String[] args) {
		
		double num1 = 5.85;
		
		int resultado = (int)Math.round(num1);//refundicion obligar a la calse math que trabaje con enteros
												//cuando esta trabaje con decimales
		
	
		System.out.println(resultado);
		
		
		double base =5;
		
		double exponente=3;
		
		int resultado1=(int)Math.pow(base, exponente);
		
		System.out.println("el resultado " + resultado1 + " es origen de  " + base + " elevado a " +exponente);
		 
		double operador1 = 7.64;
		
		int resultado2 =(int) Math.abs(operador1);//refundido
		
		System.out.println(resultado2);
		 
	}
	

}
