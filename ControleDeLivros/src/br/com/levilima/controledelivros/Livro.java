package br.com.levilima.controledelivros;

public class Livro {
	private int codigo, quantidade;
	private String nome, descricao;
	
	public Livro(String nome, String descricao, int quantidade) {
		this.setCodigo(Gerenciador.CODIGO);
		this.setNome(nome);
		this.setDescricao(descricao);
		this.setQuantidade(quantidade);
		++Gerenciador.CODIGO;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		if(codigo >= 0) this.codigo = codigo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		if(quantidade >= 0) this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String exibirLivro() {
		String conteudo = "Codigo: " + this.codigo + " Nome: " + this.nome + " Descrição: " + this.descricao + " Quantidade: " + this.quantidade;
		return conteudo;
	}
}