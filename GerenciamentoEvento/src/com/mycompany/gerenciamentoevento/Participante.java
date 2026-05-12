package com.mycompany.gerenciamentoevento;

public class Participante {
	private String nome;
	private String email;
	private int matricula;
	
	public Participante(String nome, String email, int matricula) {
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void mostrarParticipante() {
		System.out.println("Nome: " + this.nome + " " + "Matricula: " + this.matricula + " " + "E-mail: " + this.email);
	}
}