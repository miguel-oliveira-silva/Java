import java.util.*;

public class Atividade1 {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
			filaBanco(fila);
	}
	public static void filaBanco(Queue<String> fila) {
		int pedido = 1;
		Scanner teclado = new Scanner(System.in);
		while(pedido!=0) {
			System.out.println(ConsoleColors.GREEN+"********************************************************");
			System.out.println("\t1 - Adicionar cliente na Fila");
			System.out.println("\t2 - Listar todos os clientes");
			System.out.println("\t3 - Retirar clientes da fila");
			System.out.println("\t0 - sair");
			System.out.println("********************************************************");
			pedido = teclado.nextInt();
			switch (pedido) {
			case 1:
				System.out.println("\tDigite um nome para adicionar a fila");
				fila.add(teclado.next());
				break;
			case 2: 
				if(fila.isEmpty()) {
					System.out.println("\tNenhum cliente na Fila");
					break;
				}
				System.out.println("\tFila: \n "+fila+"\n");
				
				break;
			case 3: 
				if(fila.isEmpty()) {
					System.out.println("\tA Fila está vazia!");
					break;
				}
				System.out.println("\tRetirando: "+fila.remove()+" da fila \n Fila atual: " + fila);
				break;
			case 0:
				System.out.println("\tPrograma Finalizado");
				break;
			default:
				System.out.println("Entrada Inválida.");
				break;
			}
		}
		teclado.close();
	}
}
