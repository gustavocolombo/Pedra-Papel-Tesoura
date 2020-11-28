package br.com.ufc.es.pds.model;	

public class PedraPapelTesoura {
	private int palpite;
	private int palpiteMaquina;
	private Jogador jogador;
	private ControladorDoJogo controlador;
	
	public PedraPapelTesoura() {
		super();
	}
	
	public PedraPapelTesoura(int palpite, int palpiteMaquina,Jogador jogador, ControladorDoJogo controlador ) {
		this.palpite = palpite;
		this.palpiteMaquina = palpiteMaquina;
		this.jogador = jogador;
		this.controlador = controlador;
	}

	public int getPalpiteMaquina() {
		return palpiteMaquina;
	}

	public void setPalpiteMaquina(int palpiteMaquina) {
		this.palpiteMaquina = palpiteMaquina;
	}

	public int getPalpite() {
		return palpite;
	}

	public void setPalpite(int palpite) {
		this.palpite = palpite;
	}
	
	public void verificaVencedor(int palpiteJogador, int palpiteMaquina) {
		if(	palpiteJogador == 2 && palpiteMaquina == 4 || 
			palpiteJogador == 3 && palpiteMaquina == 2 || 
			palpiteJogador == 4 && palpiteMaquina == 3) {
			
				jogador.setQtdVitorias(jogador.getQtdVitorias()+1);
				controlador.setQtdVitoriasJogador(controlador.getQtdVitoriasJogador()+1);
				
		}else if (palpiteJogador == palpiteMaquina) {
			System.out.println("Houve empate! As pontuações permanecem as mesmas");
		}else {
			jogador.setQtdDerrotas(jogador.getQtdDerrotas()+1);
			controlador.setQtdVitoriasMaquina(controlador.getQtdVitoriasMaquina()+1);

		}
	}
	
}
