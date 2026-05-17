package br.com.levilima.controledelivros;

import javax.swing.JOptionPane;

public class ControleDeLivros {
	public static void main(String[] args) {
		boolean controle = true;
		String nome, descricao;
		int quantidade, busca;
		Livro livro;
		
		Gerenciador gerenciador = new Gerenciador(5);
		
		while(controle) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n1 - Adicionar um livro\n2 - Listar livros\n3 - Buscar livro\n4 - Excluir um livro\n5 - Editar um livro\n6 - Adicionar a lista de desejos\n7 - Ver lista de desejos\n0 - Sair", "Sistema de gerenciamento de livros", 3));

			switch(opcao) {
				case 1:
					nome = JOptionPane.showInputDialog(null, "Insira um nome para o livro!", "Nome", 1);
					descricao = JOptionPane.showInputDialog(null, "Insira uma descrição para o livro!", "Descrição", 1);
					quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira uma quantidade!", "Quantidade", 1));
					
					livro = new Livro(nome, descricao, quantidade);
					gerenciador.adicionarLivro(livro);
					
					JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!", "Sucesso!", 1);
					
					break;
				case 2:
					JOptionPane.showMessageDialog(null, gerenciador.listarLivros(), "Lista de livros", 1);
					break;
				case 3:
					busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do livro", "Buscar um livro", 1));
					livro = gerenciador.buscarLivro(busca);
					
					if(gerenciador.buscarLivro(busca) == null) {
						JOptionPane.showMessageDialog(null, "Livro não encontrado!", "Erro!", 0);
					} else {
						JOptionPane.showMessageDialog(null, livro.exibirLivro());
					}
					
					break;
				case 0:
					controle = false;
					JOptionPane.showMessageDialog(null, "Saindo da aplicação...");
			}
		}
	}
}