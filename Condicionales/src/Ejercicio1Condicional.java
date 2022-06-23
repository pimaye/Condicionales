import java.util.Scanner;

/**
 1. Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son 
iguales. 
  */
public class Ejercicio1Condicional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce otro numero: ");
		int num2 = teclado.nextInt();
		
		if (num1==num2) {
			System.out.println("Los numeros son iguales");
		}	
		else if (num1<num2) {
			System.out.println("El menor es "+num1+" el mayor es "+num2);
		}
		else {
			System.out.println("El menor es "+num2+" el mayor es "+num1);
		}
	}

}
