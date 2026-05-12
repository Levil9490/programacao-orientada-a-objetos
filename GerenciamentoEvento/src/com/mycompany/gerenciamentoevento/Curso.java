package com.mycompany.gerenciamentoevento;

public class Curso {
	private int codigo;
	private String nome;
	private int capacidade;
	private double duracao;
	private String data;
	private String horario;
	private String palestrante;
	private String local;
	private int id;
	private Participante participantes[];
	
	public Curso(int codigo, String nome, int capacidade, String palestrante, String local) {
		this.codigo = codigo;
		this.nome = nome;
		this.capacidade = capacidade;
		this.duracao = 0;
		this.data = "";
		this.horario = "";
		this.palestrante = palestrante;
		this.local = local;
		this.id = 0;
		this.participantes = new Participante[this.capacidade];
	}
	
	public void adicionarParticipante(Participante p) {
		if(this.id >= this.capacidade) {
			return;
		}
		this.participantes[this.id] = p;
		++this.id;
	}
	
	public void mostrarTurma() {
		for(int i = 0; i < this.id; ++i) {
			this.participantes[i].mostrarParticipante();
		}
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public double getDuracao() {
		return this.duracao;
	}
	
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public String getData() {
		return this.data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHorario() {
		return this.horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getPalestrante() {
		return this.palestrante;
	}
	
	public void setPalestrante(String palestrante) {
		this.palestrante = palestrante;
	}
	
	public String getLocal() {
		return this.local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
}