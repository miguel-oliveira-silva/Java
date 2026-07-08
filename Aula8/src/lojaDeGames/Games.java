package lojaDeGames;

public class Games {
	private String nome;
	private double preco;
	private int avaliacao;
	private int classificacaoIndicativa;
	private int plataforma;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Games(String nome, double preco, int avaliacao, int classificacaoIndicativa, int plataforma) {
		this.nome = nome;
		this.preco = preco;
		this.avaliacao = avaliacao;
		this.classificacaoIndicativa = classificacaoIndicativa;
		this.plataforma = plataforma;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	public int getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}
	

}
