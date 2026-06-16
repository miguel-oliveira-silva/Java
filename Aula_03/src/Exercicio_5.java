import java.util.Scanner;
public class Exercicio_5 {
	public static void main(String[] args) {
		final String[] PRODUTOS = {"vazio","Cachorro Quente", "X-Salada","X-Bacon","Bauru","Refrigerante","Suco de laranja"};
		Scanner scanner = new Scanner(System.in);
		int preco = 0, produto, quantidade;
		System.out.println("Código do Produto: ");
		produto = scanner.nextInt();
		if(produto < 1 || produto > 6 ) {
			System.out.println("Código invalido");
			scanner.close();
			return;
		}
		System.out.println("Quantidade: ");
		quantidade = scanner.nextInt();
		switch(produto) {
		
			case 1:
				preco = 10;	
				break;
			case 2:
				preco = 15;	
				break;
			case 3:
				preco = 18;	
				break;
			case 4:
				preco = 12;	
				break;
			case 5:
				preco = 8;	
				break;
			case 6:
				preco = 13;	
				break;
			default:
				System.out.println("Inválido");
				scanner.close();
				return;
		}
		System.out.printf("Produto: %s\n", PRODUTOS[produto]);
		System.out.printf("Valor total: %d", preco*quantidade);
		scanner.close();
	}
}
