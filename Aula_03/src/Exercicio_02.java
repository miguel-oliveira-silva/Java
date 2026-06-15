import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = scanner.nextInt();
		if(numero >= 0) {
			if(numero % 2 == 0) {
				System.out.printf("Número %d é par e positivo", numero);
			}else {
				System.out.printf("Número %d é impar e positivo", numero);
			}
		}else {
			if(numero % 2 == 0) {
				System.out.printf("Número %d é par e negativo", numero);
			}else {
				System.out.printf("Número %d é impar e negtivo", numero);
			}
		}
	}
}
