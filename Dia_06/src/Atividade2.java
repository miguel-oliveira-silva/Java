import java.util.*;

public class Atividade2 {
	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<>();
		
		pilhaLivro(pilha);
	}
	
	public static void pilhaLivro(Deque<String> pilha) {
		int pedido = 1;
		String digitado;
		Scanner teclado = new Scanner(System.in);
		while(pedido!=0) {
			System.out.println(ConsoleColors.GREEN+"********************************************************"); //eu peguei uma classe pronta de cores e coloquei no projeto
			System.out.println("\t1: Adicionar um novo livro na pilha.");
			System.out.println("\t2: Listar todos os livros da Pilha");
			System.out.println("\t3: Retirar um livro da pilha");
			System.out.println("\t0: O programa deve ser finalizado.");
			System.out.println("********************************************************");
			System.out.println("Entre com a opção desejada: ");
			 digitado = teclado.nextLine();         
			 //eu sei que podia ter colocado em um int mas estava dando problema para colocar com espaço 
			 pedido = Integer.parseInt(digitado);
			switch (pedido) {
			case 1:
				System.out.println("Digite um livro para adicionar a pilha: ");
				pilha.push(teclado.nextLine());
				break;
			case 2: 
				if(pilha.isEmpty()) {
					System.out.println("Nenhum livro foi encontrado.");
					break;
				}
				for (String livro : pilha) {
                    System.out.println(livro);
                }
				
				break;
			case 3: 
				if(pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
					break;
				}
				System.out.println("Retirando: "+pilha.pop()+" da pilha \n Pilha atual: ");
	           for (String livro : pilha) {
                    System.out.println(livro);
                }
				break;
			case 0:
				System.out.println("Programa Finalizado");
				break;
			default:
				System.out.println("Entrada Inválida.");
				break;
			}
		}
		teclado.close();
	}
}
