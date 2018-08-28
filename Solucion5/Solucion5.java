package Solucion5;
import java.util.Scanner;
public class Solucion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		float velo, conver;
		
		System.out.println("Ingrese la velocidad que desea convertir");
		velo = sc.nextInt();
		conver = velo * 5 / 18;
		System.out.println("La velocidad convertida es: "+conver);
		sc.close();
	}
}
