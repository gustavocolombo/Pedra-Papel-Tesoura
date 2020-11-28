package br.com.ufc.es.pds.model;
import java.util.Scanner;
import br.com.ufc.es.pds.model.Jogador;

public class View {
	private int escolhaJogador;
	
	public void menu() {
		System.out.println("Olá, bem vindo ao jogo de pedra, papel ou tesoura!");
		System.out.println("Digite entre os números 1 e 6 para realizar ações");
		System.out.println("Digite 1 para começar a jogar");
		System.out.println("Digite 2 para escolher pedra");
		System.out.println("Digite 3 para escolher papel");
		System.out.println("Digite 4 para escolher tesoura");
	}
	
	public void verificaJogada(int escolhaJogador) {
		Scanner ler = new Scanner(System.in);
		while(escolhaJogador > 6) {
			System.out.println("Digite uma opção válida entre 1 e 6");
			menu();
			escolhaJogador = ler.nextInt();
		}
	}
	
	public void chamaJogada(int escolhaJogador) {
		verificaJogada(escolhaJogador);
		
			switch(escolhaJogador) {
				case 1: 
					Jogador jogador = new Jogador(0,0);
					System.out.println("Seu adversário será a máquina!");
					break;
				case 2:
					break;
			}
	}

}
