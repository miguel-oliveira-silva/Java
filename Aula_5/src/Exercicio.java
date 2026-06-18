import java.util.Arrays;
import java.util.Scanner;

public class Exercicio{

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        int[] dezInteiros = new int[10];
        int inteiro = 0;

        System.out.println("Busca de número inteiro em vetor");

        for (int i = 0; i < dezInteiros.length; i++) {
            System.out.println("Digite um número para o vetor: ");
            dezInteiros[i] = leia.nextInt();
        }

        System.out.println("\nDigite o número que você deseja encontrar:");
        inteiro = leia.nextInt();
        
        if (Arrays.binarySearch(dezInteiros, inteiro) > -1) {
            System.out.printf("\nO número foi encontrado no índice: %d", Arrays.binarySearch(dezInteiros, inteiro));
        } else {
            System.out.printf("\nO número %d não foi encontrado!", inteiro);
        }

        leia.close();
    }
}