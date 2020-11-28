package br.com.ufc.es.pds.model;

public class ControladorDoJogo {
	private int qtdVitoriasJogador;
	private int qtdVitoriasMaquina;
	private int palpiteJogador;
	private int palpiteMaquina;

	public ControladorDoJogo() {
		super();
	}
	
	public ControladorDoJogo(int qtdVitoriasJogador, int qtdVitoriasMaquina,int palpiteJogador, int palpiteMaquina) {
		this.qtdVitoriasJogador = qtdVitoriasJogador;
		this.qtdVitoriasMaquina = qtdVitoriasMaquina;
		this.palpiteJogador = palpiteJogador;
		this.palpiteMaquina = palpiteMaquina;
	}

	
	public int getQtdVitoriasJogador() {
		return qtdVitoriasJogador;
	}

	public void setQtdVitoriasJogador(int qtdVitoriasJogador) {
		this.qtdVitoriasJogador = qtdVitoriasJogador;
	}

	public int getQtdVitoriasMaquina() {
		return qtdVitoriasMaquina;
	}

	public void setQtdVitoriasMaquina(int qtdVitoriasMaquina) {
		this.qtdVitoriasMaquina = qtdVitoriasMaquina;
	}

	public int getPalpiteJogador() {
		return palpiteJogador;
	}

	public void setPalpiteJogador(int palpiteJogador) {
		this.palpiteJogador = palpiteJogador;
	}

	public int getPalpiteMaquina() {
		return palpiteMaquina;
	}

	public void setPalpiteMaquina(int palpiteMaquina) {
		this.palpiteMaquina = palpiteMaquina;
	}

	@Override
	public String toString() {
		return "ControladorDoJogo [qtdVitoriasJogador=" + qtdVitoriasJogador + ", qtdVitoriasMaquina="
				+ qtdVitoriasMaquina + "]";
	}
	
	
}
