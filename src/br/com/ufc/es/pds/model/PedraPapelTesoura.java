package br.com.ufc.es.pds.model;

public class PedraPapelTesoura {
	private Jogador palpite;
	private int palpiteMaquina;
	
	public PedraPapelTesoura() {
		super();
	}
	
	public PedraPapelTesoura(Jogador palpite, int palpiteMaquina) {
		this.palpite = palpite;
		this.palpiteMaquina = palpiteMaquina;
	}

	public int getPalpiteMaquina() {
		return palpiteMaquina;
	}

	public void setPalpiteMaquina(int palpiteMaquina) {
		this.palpiteMaquina = palpiteMaquina;
	}

	public Jogador getPalpite() {
		return palpite;
	}

	public void setPalpite(Jogador palpite) {
		this.palpite = palpite;
	}
	
	
}
