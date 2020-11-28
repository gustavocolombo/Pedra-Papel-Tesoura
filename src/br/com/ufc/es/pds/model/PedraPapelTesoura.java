package br.com.ufc.es.pds.model;

import java.util.Random;

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
	
	public void palpiteMaquina() {
		Random random = new Random();
		this.setPalpiteMaquina(random.nextInt(3));
	}
	
	public void verificaVencedor(int palpiteJogador) {
		palpiteMaquina();
		if(	palpiteJogador == 1 && getPalpiteMaquina() == 3 || 
			palpiteJogador == 3 && getPalpiteMaquina() == 2 || 
			palpiteJogador == 2 && getPalpiteMaquina() == 1) {
			
				jogador.setQtdVitorias(jogador.getQtdVitorias()+1);
				controlador.setQtdVitoriasJogador(controlador.getQtdVitoriasJogador()+ 1);
				System.out.println("Você ganhou da máquina!Seus pontos são" +controlador.getQtdVitoriasJogador() + "X" +controlador.getQtdVitoriasMaquina());
				
		}else if (palpiteJogador == palpiteMaquina) {
			System.out.println("Houve empate! As pontuações permanecem as mesmas");
		}else {
			jogador.setQtdDerrotas(jogador.getQtdDerrotas()+1);
			controlador.setQtdVitoriasMaquina(controlador.getQtdVitoriasMaquina()+1);
			System.out.println("Você perdeu para a máquina! Seus pontos são:" +controlador.getQtdVitoriasJogador() + "X" +controlador.getQtdVitoriasMaquina());
		}
		
	}
	
}
