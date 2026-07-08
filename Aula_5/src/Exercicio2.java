import java.util.*;
public class Exercicio2 {
	
	public static void main(String[] args) {
		int numeros[][]= new int[3][3];
		inserir(numeros);
		elementos(numeros);
	}
	public static void inserir(int numeros[][]) {
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			
			for(int g = 0; g < 3; g++) {
				System.out.printf("Preencha a linha %d coluna %d \n", i , g);
				numeros[i][g] = teclado.nextInt();
				teclado.nextLine();
				
			}
		}
		teclado.close();
	}
	public static void elementos(int numeros[][]) {
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		int g = 2;
		System.out.printf("Elementos da Diagonal Principal: \n");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d ", numeros[i][i]);
			somaDiagonalPrincipal += numeros[i][i];
		}
		System.out.printf("\n Elementos da Diagonal Secundaria:\n ");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d ", numeros[i][g]);
			somaDiagonalSecundaria += numeros[i][g];
			g--;
		}
		System.out.printf("\nSoma dos Elementos da Diagonal Principal:\n %d \n", somaDiagonalPrincipal);
		System.out.printf("Soma Elementos da Diagonal Secundaria:\n %d \n ", somaDiagonalSecundaria);
	}
	
}
