import java.util.Scanner;
public class Exercicio_8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int operacao;
		float saque;
		float saldo = 1000;
		float deposito;
		System.out.println("Digite o número da operação que quer realizar: ");
		operacao = teclado.nextInt();
		
		switch (operacao) {
		case 1: 
			System.out.println("Operação: Saldo");
			System.out.println("Saldo: " + saldo);
			break;
		case 2: 
			System.out.println("Operação: Saque");
			System.out.println("Digite o valor do saque que quer realizar: ");
			saque = teclado.nextFloat();
			if(saque > saldo) {
				System.out.println("Saldo insuficiente!");
				break;
			}
				saldo -= saque;
				System.out.printf("Novo Saldo: R$ %.2f", saldo);
			break;
		case 3: 
			System.out.println("Operação: Depósito");
			System.out.println("Digite o valor do deposito que quer realizar: ");
			deposito = teclado.nextFloat();
			if(deposito < 0) {
				System.out.println("Valor não pode ser negativo");
				break;	
			}
			saldo += deposito;
			System.out.printf("Novo Saldo: R$ %.2f", saldo);
			break;
		default:
			System.out.println("Valor inválido de operação");
		}
		teclado.close();
	}
}
