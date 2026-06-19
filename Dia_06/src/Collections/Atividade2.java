package Collections;
import java.util.*;
public class Atividade2 {
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		inserir(numeros);
		listar(numeros);
	}
	public static void inserir(Set<Integer> numeros) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite 10 numeros diferentes");
		for(int i = 0; i < 10; i++) {
			numeros.add(teclado.nextInt());
		}
				teclado.close();
	}
	public static void listar(Set<Integer> numeros) {
		Iterator<Integer> interagir = numeros.iterator();
		System.out.println("Numeros: ");
		while(interagir.hasNext()) {
			System.out.println(interagir.next());
		}
		
	}

}
