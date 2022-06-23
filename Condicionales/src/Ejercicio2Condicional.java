import java.util.Scanner;

/**
 * 2. Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la 
posición central si los tres se ordenasen.


 */
public class Ejercicio2Condicional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		float num1 = entrada.nextFloat();
		
		System.out.println("Introduce un numero: ");
		float num2 = entrada.nextFloat();
		
		System.out.println("Introduce un numero: ");
		float num3 = entrada.nextFloat();
		
		if(((num1>num2)&&(num1<num3)) || ((num1>num3) && (num1<num2))){
			System.out.println("el num central es num1: "+num1);
			
		}else if (((num2>num1)&&(num2<num3)) || ((num2>num3) && (num2<num1))) {
			System.out.println("El num central es num2 "+num2);
		} else {
			System.out.println("el numero central es num3 "+num3);
		}

	}

}
