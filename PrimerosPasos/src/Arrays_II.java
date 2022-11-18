
public class Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] paises = new String[8]; //es esta vertiente vemos que va a crear un array con string.
		
		/*paises[0] = "españa";
		paises[1] = "mexico";
		paises[2] = "colombia";
		paises[3] = "peru";
		paises[4] = "chile";
		paises[5] = "argentina";
		paises[6] = "ecuador";
		paises[7] = "venezuela";
		*/
		
		//		String [] paises = {"españa","mexico","colombia","peru","chile", "argentina","ecuador","venezuela"};
		
		/*for(int i=0;i<paises.length;i++) {
			
			System.out.println("paises "+ (i+1) + " " + paises [i]);
			
		}*/
for(String elemento:paises) {//el nuevo for
	 
	System.out.println("paises " +elemento);
}
	}	

}
