package exerciciosColections;
import java.util.*;
public class Exercicio3 {

	
	public static class Produto{
		String nomeProduto;
		int quantidade;
		public Produto(String nome, int quantidade){
			this.nomeProduto = nome;
			this.quantidade = quantidade;
		}
	}
	
	public static void adicionarProduto(List<Produto> produtos, Scanner leia) {
		Produto produto;
		String nomeProduto;
		int quantidade;
		leia.nextLine();
		System.out.println("\nDigite o nome do produto:");
		nomeProduto = leia.nextLine();
		System.out.println("\nDigite a quantidade do produto:");
		quantidade = leia.nextInt();
		produto = new Produto(nomeProduto,quantidade);
		produtos.add(produto);
		System.out.println("\nProduto registrado!");
	}
	
	public static void listarProdutos(List<Produto> produtos) {
		if(produtos.size() > 0) {
			System.out.println("\nProdutos:\n");
			for(Produto produto : produtos) {
				System.out.printf("\nProduto: %-15s | Quantidade: %d\n", produto.nomeProduto, produto.quantidade);
			}
		}else {
			System.out.println("\nNenhum produto registrado!");
		}
		
	}
	public static void atualizarProduto2(List<Produto> produtos, Scanner leia) {
		int resposta = 0;
		Produto produtoAtualizado;
		for(Produto produto: produtos) {
			System.out.printf("Código do produto %d | Nome do produto: %s | Quantidade do produto %d\n" ,resposta++,produto.nomeProduto,produto.quantidade);
		}
		System.out.println("Me informe o código do produto que deseja alterar");
		resposta = leia.nextInt();
		if(resposta > produtos.size() || resposta < 0) {
			System.out.println("Código não existe!");
			return;
		}
		produtoAtualizado = produtos.get(resposta); // pega pelo indice
		System.out.println("Digite a nova quantidade do produto");
		produtoAtualizado.quantidade = leia.nextInt();
		leia.nextLine();
		listarProdutos(produtos);
		System.out.println("Pressione enter para continuar");
		leia.nextLine();
		
	}
	public static void atualizarProduto(List<Produto> produtos) {
		int contador = 0;
		int resposta = 0;
		
		String[] produtosRegistrados = new String[produtos.size()];
		
		if(produtos.size() > 0) {
			Map<Integer, String> opcoesDeProdutos = new HashMap<>();
			System.out.println("\nVocê deseja atualizar a quantidade de qual produto?");
			
			for(Produto produto : produtos) {
				System.out.printf("%d - %s (quantidade atual: %d)\n", ++contador, produto.nomeProduto, produto.quantidade);
				opcoesDeProdutos.put(contador, produto.nomeProduto);
			}
			
			resposta = leia.nextInt();
			
			if(resposta < produtos.size() && resposta > -1) {
				resposta = produtos.indexOf(opcoesDeProdutos.get(resposta));
				Produto produto = produtos.get(produtos.indexOf(resposta));
				
				System.out.printf("\nDigite a nova quantidade do produto %s:", produto.nomeProduto);
				produto.quantidade = leia.nextInt();
				
				System.out.println("Produto atualizado!");
			}else {
				System.out.println("\nEscolha inválida!\n");
			}
		}else {
			System.out.println("\nNenhum produto registrado! Não é possível atualizar.");
		}
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		boolean novoRegistro = true;
		
		while(novoRegistro) {
			System.out.println("\n˜˜˜˜˜˜˜˜˜Controle de estoque˜˜˜˜˜˜˜˜˜");
			System.out.println("1 - Registrar novo produto");
			System.out.println("2 - Atualizar quantidade de um produto");
			System.out.println("3 - Listar produtos registrados");
			System.out.println("Digite qualquer outro número para sair.\n");
			
			switch(leia.nextInt()) {
				case 1:
					adicionarProduto(produtos, leia);
					break;
				case 2:
					atualizarProduto2(produtos, leia);
					break;
				case 3:
					listarProdutos(produtos);
					break;
				default:
					novoRegistro = false;
					System.out.println("\nFim do programa!");
					break;
			}
		}
	}
}