import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		int maiorIdade = 0;
		int menorIdade = 0;
		int controle;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma idade: ");
		controle = teclado.nextInt();
		while(controle >= 0) {
			if(controle < 21) {
				menorIdade++;
			}else if(controle> 50) {
				maiorIdade++; 
			}
			controle = teclado.nextInt();
		}
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", menorIdade);
		System.out.printf("Total de pessoas maiores de 50 anos: %d\n", maiorIdade);
		teclado.close();
	}
	
}
