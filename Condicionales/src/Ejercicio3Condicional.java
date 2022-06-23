import java.util.Scanner;

/**
 * 3. Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar 
si están en la misma fila, columna, o en la misma diagonal. 
 * @author David
 *
 */
public class Ejercicio3Condicional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Pieza2");
		
		
		if(fila1==fila2) {
			System.out.println("Las piezas están en la misma fila");
		}
		if(col1==col2) {
			System.out.println("Las piezas están en la misma columna");
		}
		if ((fila1-fila2)==(col1-col2)) {
			System.out.println("La segunda está en la diagonal principal de la otra");
		}
		if (((fila1-fila2)+(col1-col2))==0) {
			System.out.println("La segunda está en la diagonal secundaria de la otra");
		}
		else
			System.out.println("No hay pieza que comer");
		

	}

}
