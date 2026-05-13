package br.com.levilima.controledelivros;

public class Gerenciador {
	private Livro livros[];
	static int CODIGO = 0;
	private int tamanho, id;
	private String listaDeDesejos;
	
	public Gerenciador(int tamanho) {
		this.tamanho = tamanho;
		this.livros = new Livro[this.tamanho];
		this.id = 0;
		this.listaDeDesejos = "";
	}
	
	public void adicionarLivro(Livro livro) {
		if(this.id < this.tamanho) {
			this.livros[this.id] = livro;
			++this.id;
		}
	}
}