package Solucion6;
import java.util.Scanner;
public class Solucion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero = 1, suma = 0;
		
		while(numero <=100) {
			suma += numero;
			numero++;
		}
		
		System.out.println("La suma de los 100 numeros es: "+suma);
		sc.close();
	}
}
