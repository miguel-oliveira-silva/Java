import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float salario, abono, total;
		System.out.println("Digite o Salário: ");
		salario = scan.nextFloat();
		System.out.println("Digite o Abono: ");
		abono = scan.nextFloat();
		total = abono+salario;
		System.out.printf("Novo salário: %.2f",total);
	}
}
