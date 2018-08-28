package Solucion7;
import java.util.Scanner;
public class Solucion7B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero, factorial = 1, i;
		System.out.println("Ingrese el numero del quiere saber su factorial");
		numero = sc.nextInt();
		while(numero < 0)
			factorial = 0;
		while(numero == 0)
			factorial = 1;
		for (i = 1; i <= numero;) {
				factorial = factorial * i;
				i++;
		}
		
		System.out.println("El factorial es: "+factorial);
		sc.close();
	}
}
