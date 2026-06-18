import java.util.*;
public class Collections {
	public static void main(String[] args) {
		int i = 0;
		int numeroa = 1;
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		while(numeroa != 0) {
			System.out.println("Me de um numero");
			numeroa = teclado.nextInt();
			lista.add(numeroa);
		}
		for(int numero : lista) {
			System.out.println(numero);
		}
		
		teclado.close();
	}
}
