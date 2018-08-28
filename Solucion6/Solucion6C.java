package Solucion6;
import java.util.Scanner;
public class Solucion6C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero = 1, impar = 0; 
		while(numero <50) {
			if(numero % 2 != 0)
			impar += numero;
			numero++;
		}
		
		System.out.println("La suma de los numeros impares hasta 50 es: "+impar);
		sc.close();
	}
}
