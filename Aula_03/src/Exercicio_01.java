import java.util.Scanner;
public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scannner = new Scanner(System.in);
		char letras[] = new char[3];
		int numerosSoma[] = new int[3];
		letras[0] = 'A';
		letras[1] = 'B';
		letras[2] = 'C';
		for(int i = 0; i < 3; i++) {
			System.out.printf("Digite o número %c: ", letras[i]);
			numerosSoma[i] = scannner.nextInt();
		}
		numerosSoma[0] += numerosSoma[1];
		if(numerosSoma[0] > numerosSoma[2]) 
			System.out.printf("A Soma de %c + %c é Maior do que %c", letras[0], letras[1], letras[2]);
		else if(numerosSoma[0] < numerosSoma[2])
			System.out.printf("A Soma de %c + %c é menor do que %c", letras[0], letras[1], letras[2]);
		else
			System.out.printf("A Soma de %c + %c é igual a %c", letras[0], letras[1], letras[2]);
	}
}

