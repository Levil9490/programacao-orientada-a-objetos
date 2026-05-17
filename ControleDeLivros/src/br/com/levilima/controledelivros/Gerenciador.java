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
	
	public void excluirLivro(int codigo) {
		for(int i = 0; i < this.id; ++i) {
			if(this.livros[i].getCodigo() == codigo) {
				if(i < (this.id - 1)) {
					for(int j = i; j < (this.id - 1); ++j) {
						this.livros[j] = this.livros[j + 1];
					}
					--this.id;
					return;
				}
			}
		}
	}
	
	public void editarLivro(int codigo, String nome, String descricao, int quantidade) {
		for(int i = 0; i < this.id; ++i) {
			if(codigo == this.livros[i].getCodigo()) {
				this.livros[i].setNome(nome);
				this.livros[i].setDescricao(descricao);
				this.livros[i].setQuantidade(quantidade);
			}
		}
	}
}