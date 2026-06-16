import java.util.Scanner;

public class Atividade_1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		boolean autorizacao;
		System.out.println("Por favor me informe seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Por favor me informe sua idade: ");
		idade = teclado.nextInt();
		System.out.println("Possui autorização dos responsáveis (responda com true ou false): ");
		autorizacao = teclado.nextBoolean();
		System.out.printf("Acesso %s para %s", liberacao(idade, autorizacao), nome);
		teclado.close();
	}
	
	
	public static String liberacao(int idade,boolean autorizacao) {
		if(idade >= 18) {
			return "liberado";
		}
		if(autorizacao) {
			return "liberado com autorização";
		}else{
			return "negado";
		}
	}
}
