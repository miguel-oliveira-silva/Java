package Collections;
import java.util.*;

public class Atividade1 {
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		inserirCor(cores);
		ordenaMostra(cores);
	}
	
	public static void inserirCor(ArrayList<String> cores) {
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira uma cor: ");
			cores.add(teclado.next());
		}
		teclado.close();
	}
	public static void ordenaMostra(ArrayList<String> cores) {
		System.out.println("Essas são as suas cores");
		for(String cor : cores) {
			System.out.println(cor);
		}
		cores.sort(null);
		System.out.println("Essas são as suas cores ordenadas");
		for(String cor : cores) {
			System.out.println(cor);
		}
	}
	
}
