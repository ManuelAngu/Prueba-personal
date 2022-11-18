import java.util.Scanner;

public class NumeroMayor {


public static void main(String[] args) {

@SuppressWarnings("resource")
Scanner entrada=new Scanner(System.in);
int a,b,c;
System.out.println("introduce el primer numero para el valor A,por favor: ");
	
 a = entrada.nextInt();

System.out.println("introduce el segundo numero para el valor B,por favor: ");

 b = entrada.nextInt();

System.out.println("introduce el tercer numero para el valor C,por favor: ");

 c = entrada.nextInt();

int x ;//Variable de numero entero usada como valor para declarar el numero mas alto 

if(a<b) {
x=b;}
else {
x=a;}
if(x<c) {
x=c;System.out.println("el numero mas alto es :"+ x);	
	
}
}
}
