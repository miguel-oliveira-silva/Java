package aula01Variaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1 = 10, numero2 = 5;
		float numero3, numero4;
		System.out.println("Essa é a variavel numero 1: "+numero1+"\nEssa é a variavel numero 2: " + numero2);
		System.out.printf("%d + %d = %d\n", numero1, numero2 , numero1+numero2 );
		System.out.println("Digite primeiro valor: ");
		numero3 = scan.nextFloat();
		System.out.println("Digite segundo valor: ");
		numero4 = scan.nextFloat();
		System.out.println(numero4);
	}

}
