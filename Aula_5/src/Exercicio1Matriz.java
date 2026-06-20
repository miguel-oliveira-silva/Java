import java.util.*;
public class Exercicio1Matriz {
	public static void main(String[] args) {
		int numeros[] = new int[]{8,5,2,4,6,9,8,1,6,10};
		posicao(numeros);
	}
	public static void posicao(int[] numeros) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int posicao;
		Arrays.sort(numeros);
		System.out.println("Me informe o numero que quer saber a posição: ");
		numero = teclado.nextInt();
		posicao = Arrays.binarySearch(numeros, numero);
		if(posicao<0) 
			System.out.printf("O numero %d não foi encontrado\n",numero);
		else
			System.out.printf("O %d esta armazenado na posição %d\n",numero,posicao);
	}
}
