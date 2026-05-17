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
	
	public String listarLivros() {
		String conteudo = "";
		
		for(int i = 0; i < this.id; ++i) conteudo += this.livros[i].exibirLivro() + "\n";
		
		return conteudo;
	}
	
	public Livro buscarLivro(int codigo) {
		for(int i = 0; i < this.id; ++i) if(this.livros[i].getCodigo() == codigo) return this.livros[i];
		return null;
	}
}