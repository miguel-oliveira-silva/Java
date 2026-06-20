package exerciciosColections;

import java.util.*;

public class Exercicio2 {
	
	public static class Aluno{
		int idade;
		String nome;
		double notaFinal;
		
		public Aluno(int idade,double nota, String nome) {
			this.idade = idade;
			this.nome = nome;
			this.notaFinal = nota;
		}
		public Aluno() {}
	}
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Aluno> alunos= new ArrayList<Aluno>();
		Scanner teclado = new Scanner(System.in); 
		tela(alunos,teclado);
	}
	
	public static void tela(ArrayList<Aluno> alunos,Scanner teclado) {
		int entrada;
		do {
			System.out.println("Digite 1 para adicionar um aluno");
			System.out.println("Digite 2 para listar alunos cadastrados");
			System.out.println("Digite 3 para ver a média geral");
			System.out.println("Digite 0 para sair do sistema.");
			entrada = teclado.nextInt();
			teclado.nextLine();
			switch (entrada) {
			case 1:
				adicionar(alunos,teclado);
				break;
			case 2:
				listar(alunos);
				break;
			case 3:
				mediaAlunos(alunos);
				break;
				
			default:
				System.out.println("Numero invalido");
				break;
			}
		}while(entrada!=0);
		

	}
	
	public static void adicionar(ArrayList<Aluno> alunos,Scanner teclado) {
		int idade;
		double nota;
		String nome;
		System.out.println("Digite o nome do aluno: ");
		nome=teclado.nextLine();
		System.out.println("Digite a idade do aluno: ");
		idade=teclado.nextInt();
		System.out.println("Digite a nota final do aluno: ");
		nota=teclado.nextDouble();
		teclado.nextLine();//limpar o teclado
		Aluno novoAluno = new Aluno(idade, nota,nome);
		alunos.add(novoAluno);
	}
	public static void listar(ArrayList<Aluno> alunos) {
		for(Aluno aluno : alunos) {
			System.out.printf("%s | %d | %.2f\n",aluno.nome,aluno.idade,aluno.notaFinal);
		}
	} 
	public static void mediaAlunos(ArrayList<Aluno> alunos) {
		double media = 0;
		for(Aluno aluno : alunos) {
			media += aluno.notaFinal;
		}
		if(alunos.isEmpty()) {
			System.out.println("Não existem alunos cadastrados.");
			return;
		}
		
		media = media/alunos.size();
		System.out.printf("A media de todos os alunos é : %.2f\n",media );
	} 
}
