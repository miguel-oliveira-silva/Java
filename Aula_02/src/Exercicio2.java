import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float media = 0	;
		for(int i = 0; i < 5; i++) {
			System.out.printf("\nNota %d: ", i);
			media =+ scan.nextFloat();
		}
		System.out.printf("\nMédia final: %.2f", media);
	}
}
