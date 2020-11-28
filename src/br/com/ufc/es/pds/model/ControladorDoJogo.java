package br.com.ufc.es.pds.model;

public class ControladorDoJogo {
	private int qtdVitoriasJogador;
	private int qtdVitoriasMaquina;

	public ControladorDoJogo() {
		super();
	}
	
	public ControladorDoJogo(int qtdVitoriasJogador, int qtdVitoriasMaquina) {
		this.qtdVitoriasJogador = qtdVitoriasJogador;
		this.qtdVitoriasMaquina = qtdVitoriasMaquina;
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


	@Override
	public String toString() {
		return "ControladorDoJogo [qtdVitoriasJogador=" + qtdVitoriasJogador + ", qtdVitoriasMaquina="
				+ qtdVitoriasMaquina + "]";
	}
	
	
}
