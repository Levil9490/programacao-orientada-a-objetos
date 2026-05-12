package com.mycompany.loja;

public class GerenciamentoProdutos {
	private Produto produtos[];
	private int tamanho;
	private int id;
	static int CODIGO = 200;
	
	public GerenciamentoProdutos(int tamanho) {
		this.tamanho = tamanho;
		this.produtos = new Produto[this.tamanho];
		this.id = 0;
	}
	
	public void adicionarProduto(Produto produto) {
		if(this.id < this.tamanho) {
			this.produtos[this.id] = produto;
			++this.id;
		}
	}
	
	public String listarProdutos() {
		String conteudo = "";
		
		for(int i = 0; i < this.id; ++i) {
			conteudo = conteudo + this.produtos[i].exibirProduto() + "\n\n";
		}
		
		return conteudo;
	}
	
	public Produto buscarProduto(int codigo) {
		for(int i = 0; i < this.id; ++i) {
			if(this.produtos[i].getCodigo() == codigo) {
				return this.produtos[i];
			}
		}
		return null;
	}
	
	public void excluirProduto(int codigo) {
		for(int i = 0; i < this.id; ++i) {
			if(this.produtos[i].getCodigo() == codigo) {
				if(i < (this.id - 1)) {
					for(int j = i; j < (this.id - 1); ++j) {
						this.produtos[j] = this.produtos[j + 1];
					}
					--this.id;
					return;
				}
			}
		}
	}
	
	public void atualizarProduto(int codigo, String nome, double preco, int quantidade, String vencimento, String categoria, String descricao) {
		for(int i = 0; i < this.id; ++i) {
			if(codigo == this.produtos[i].getCodigo()) {
				this.produtos[i].setNome(nome);
				this.produtos[i].setPreco(preco);
				this.produtos[i].setQuantidade(quantidade);
				this.produtos[i].setVencimento(vencimento);
				this.produtos[i].setCategoria(categoria);
				this.produtos[i].setDescricao(descricao);
			}
		}
	}
}