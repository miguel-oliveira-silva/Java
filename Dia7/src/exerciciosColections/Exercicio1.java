package exerciciosColections;

import java.util.*;

public class Exercicio1 {
	public static void main(String[] args) {
		ArrayList<Double> listaNumeors = new ArrayList<Double>();
		adicionar(listaNumeors);
		infosLista(listaNumeors);
	}
	public static void adicionar(ArrayList<Double> listaNumeors) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero");
			listaNumeors.add(teclado.nextDouble());
		}
		teclado.close();
	}
	public static void infosLista(ArrayList<Double> listaNumeors) {
		double maior = listaNumeors.get(0);
		double soma = 0;
		double media;
		System.out.println("A coleção de numeros: ");
		for(double numero : listaNumeors) {
			soma += numero;
			if(maior < numero)
				maior = numero;
			System.out.printf("%.0f \n",numero);
		}
		media = soma/listaNumeors.size();
		System.out.printf("Soma %.0f Média %.1f Maior Valor: %.0f", soma, media, maior);
	}
}
