package br.com.ufc.es.pds.model;

public class Jogador {
	private int qtdVitorias;
	private int qtdDerrotas;
	
	public Jogador() {
		super();
	}
	
	public Jogador(int qtdVitorias, int qtdDerrotas) {
		this.qtdVitorias = qtdVitorias;
		this.qtdDerrotas = qtdDerrotas;
	}

	public int getQtdVitorias() {
		return qtdVitorias;
	}
	
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}

	public int getQtdDerrotas() {
		return qtdDerrotas;
	}

	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}

	
	@Override
	public String toString() {
		return "[qtdVitorias=" + qtdVitorias + ", qtdDerrotas=" + qtdDerrotas + "]";
	}
}
