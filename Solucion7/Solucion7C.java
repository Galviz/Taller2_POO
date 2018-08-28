package Solucion7;
import java.util.Scanner;
public class Solucion7C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero, anterior = 1,contador = 1, i;
        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();
        System.out.println("El fibonacci del numero es:");
        System.out.println(anterior + " ");
        for(i = 2 ;i <= numero; i++){
             System.out.println(contador + " ");
             contador += anterior;
             anterior = contador - anterior;
        }
		sc.close();
	}
}
