package br.com.levilima.controledelivros;

import javax.swing.JOptionPane;

public class ControleDeLivros {
	public static void main(String[] args) {
		boolean controle = true;
		
		
		
		while(controle) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n1 - Adicionar um livro\n2 - Listar livros\n3 - Buscar livro\n4 - Excluir um livro\n5 - Editar um livro\n6 - Adicionar a lista de desejos\n7 - Ver lista de desejos\n0 - Sair", "Sistema de gerenciamento de livros", 3));

			switch(opcao) {
				case 0:
					controle = false;
					JOptionPane.showMessageDialog(null, "Saindo da aplicação...");
			}
		}
	}
}