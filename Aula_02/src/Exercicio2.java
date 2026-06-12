import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float media = 0	;
		for(int i = 1; i < 5; i++) {
			System.out.printf("\nNota %d: ", i);
			media = media + scan.nextFloat();
		}
		media = media/4;
		System.out.printf("\nMédia final: %.2f", media);
	}
}
