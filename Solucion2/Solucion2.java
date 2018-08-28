package Solucion2;
import java.util.Scanner;
public class Solucion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero, doble, cuadru, quintu;
		
		System.out.println("Ingrese un numero");
		numero = sc.nextInt();
		doble = 2 * numero;
		System.out.println("El doble del numero es: "+doble);
		cuadru = 4 * numero;
		System.out.println("El cuadruple del numero es: "+cuadru);
		quintu = 5 * numero;
		System.out.println("El quintuple del numero es: "+quintu);
		sc.close();
	}
}
