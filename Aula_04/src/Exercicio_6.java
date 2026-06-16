import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int controle = 1;
		float media = 0;
		int quantidade = 0;
		do {
			if(controle%3==0) {
				quantidade++;
				media = media + controle;
			}
			System.out.println("Digite um número: ");
			controle = teclado.nextInt();
		}while(controle != 0);
		if(quantidade != 0)
			media =  media/quantidade;
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f",media);
	}
}
