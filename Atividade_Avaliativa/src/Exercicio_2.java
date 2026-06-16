import java.util.Scanner;

public class Exercicio_2 {
	
	public static class Aluno{
		private float nota;
		private String nome;
		Aluno(float nota, String nome){
			this.nota = nota;
			this.nome = nome;
		}
		public String situacao() {
			if(this.nota >= 7)
				return "Aprovado";
			if(this.nota >= 5)
				return "Recuperação";
			
			return "Reprovado"; 
		}
		public void passou() {
			System.out.printf("Aluno: %s Situação: %s \n", this.nome, situacao());
		} 
		
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float nota;
		String nome;
		System.out.println("Nome: ");
		nome = teclado.nextLine();
		System.out.println("Nota: ");
		nota = teclado.nextFloat();
		Aluno aluno = new Aluno(nota,nome);
		aluno.passou();
		teclado.close();
		
	}
}

