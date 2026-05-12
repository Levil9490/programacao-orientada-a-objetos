package com.mycompany.gerenciamentoevento;

public class GerenciamentoEvento {
	public static void main(String[] args) {
		Participante p1 = new Participante("Ana", "ana@teste.com", 122);
		Participante p2 = new Participante("Paulo", "paulo@teste.com", 123);
		Participante p3 = new Participante("Maria", "maria@teste.com", 124);
		p1.mostrarParticipante();
		
		Curso curso = new Curso(678, "Java", 5, "Pedro", "Sala 01");
		curso.adicionarParticipante(p1);
		curso.adicionarParticipante(p2);
		curso.adicionarParticipante(p3);
		curso.mostrarTurma();
	}
}