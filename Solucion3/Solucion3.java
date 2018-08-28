package Solucion3;
import java.util.Scanner;
public class Solucion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		float centigrados, fahrenheit;
		System.out.println("Ingrese los grados centigrados que quiere convertir");
		centigrados = sc.nextFloat();
		fahrenheit = 32 + (9 * centigrados / 5);
		System.out.println("Los grados convertidos en fahrenheit son: "+fahrenheit);
		sc.close();
	}
}
