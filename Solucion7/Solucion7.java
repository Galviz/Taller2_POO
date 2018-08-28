package Solucion7;
import java.util.Scanner;
public class Solucion7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero, resultado = 1, i;
		System.out.println("Ingrese el numero del cual desea saber su tabla de multiplicar");
		numero = sc.nextInt();
		for(i = 1; i <= 12; i++) {
			resultado = numero * i;
			System.out.println(numero + "x" + i + "=" + resultado);
		}
		sc.close();
	}
}
