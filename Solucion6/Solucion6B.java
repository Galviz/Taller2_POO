package Solucion6;
import java.util.Scanner;
public class Solucion6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero = 1, par = 0; 
		while(numero <=50) {
			if(numero % 2 == 0)
			par += numero;
			numero++;
		}
		
		System.out.println("La suma de los numeros pares hasta 50 es: "+par);
		sc.close();
	}
}
