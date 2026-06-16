import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroMinimo;
		int numeroMaximo;
		boolean multiplo;
		System.out.println("Digite o primeiro número do intervalo: ");
		numeroMinimo = teclado.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		numeroMaximo = teclado.nextInt();
		if(numeroMaximo <= numeroMinimo) {
			System.out.println("Intervalo inválido");
			return;
		}
		System.out.printf("No Intervalo entre %d e %d: \n", numeroMinimo, numeroMaximo);
		for(int i = numeroMinimo; i < numeroMaximo; i++) {
			multiplo = (i%5==0 && i%3==0);
			if(multiplo) {
				System.out.printf("%d é múltiplo de 3 e 5 \n", i);
			}
		}
		teclado.close();
	}
}
