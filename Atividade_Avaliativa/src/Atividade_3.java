import java.util.Scanner;
public class Atividade_3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float primeiroNumero;
		float segundoNumero;
		float resultado;
		String operacao;
		System.out.println("Primeiro numero: ");
		primeiroNumero = teclado.nextFloat();
		System.out.println("Segundo numero: ");
		segundoNumero = teclado.nextFloat();
		System.out.println("Código da operação:\r\n"
				+ "1 – Soma\r\n"
				+ "2 – Subtração\r\n"
				+ "3 – Multiplicação\r\n"
				+ "4 – Divisão\r\n");
		operacao = teclado.next();
		switch (operacao) {
		case "1":
			operacao = "soma";
			resultado = primeiroNumero + segundoNumero;
			break;
		case "2":
			operacao = "subtração";
			resultado = primeiroNumero - segundoNumero;
			break;
		case "3":
			operacao = "multiplicação";
			resultado = primeiroNumero * segundoNumero;
			break;
		case "4":
			operacao = "divisão";
			if(segundoNumero == 0) {
				System.out.println("Operação não possível");
				teclado.close();
				return;
			}
			resultado = primeiroNumero / segundoNumero;
			break;
		default:
			System.out.println("Operação inválida.");
			teclado.close();
			return;
		}
		System.out.printf("Operação: %s Resultado: %.2f", operacao, resultado);
		teclado.close();
	}
}
