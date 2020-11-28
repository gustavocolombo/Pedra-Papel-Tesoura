package br.com.ufc.es.pds.model;
import java.util.Scanner;
import br.com.ufc.es.pds.model.Jogador;

public class View {
	private int escolhaJogador;
	Scanner ler = new Scanner(System.in);
	
	public void menu() {
		System.out.println("--------------------------------------------------");
		System.out.println("Olá, bem vindo ao jogo de pedra, papel ou tesoura!");
		System.out.println("Digite entre os números 1 e 6 para realizar ações");
		System.out.println("Digite 1 para começar a jogar");
		System.out.println("Digite 2 para sair");
		System.out.println("Caso escolheu jogar Digite 1 para escolher pedra");
		System.out.println("Caso escolheu jogar Digite 2 para escolher papel");
		System.out.println("Caso escolheu jogar Digite 3 para escolher tesoura");
		System.out.println("--------------------------------------------------");
	}
	
	public void verificaJogada(int escolhaJogador) {
		while(escolhaJogador > 6) {
			System.out.println("Digite uma opção válida entre 1 e 6");
			menu();
			escolhaJogador = ler.nextInt();
		}
	}
	
	public void chamaJogada(int escolhaJogador) {
		verificaJogada(escolhaJogador);
		boolean parar = false;
		PedraPapelTesoura jogo = null;
		Jogador jogador = null;
		ControladorDoJogo control = null;
			
			while(parar != true) {
				switch(escolhaJogador) {
				case 1: 
					jogador = new Jogador(0,0);
					control = new ControladorDoJogo(0,0,0,0);
					jogo = new PedraPapelTesoura(0,0, jogador, control);
					
					System.out.println("Seu adversário será a máquina!");
					System.out.println("Seus pontos no momento são" + jogador.toString());
					break;
				case 2:
					parar = true;
					break;
				}
				
				while(parar !=true) {
					if(escolhaJogador == 1) {
						System.out.println("Digite 1 para pedra, 2 para papel e 3 para tesouras");
							int jogadaAtualjogador = ler.nextInt();
						
							jogo.verificaVencedor(jogadaAtualjogador);
						
						System.out.println("Deseja continuar a jogar? Digite 1 para continar e 2 para sair");
							int decisaoContinuar = ler.nextInt();
							while(decisaoContinuar > 2) {
								System.out.println("Digite um valor válido para continuar ou parar");
								menu();
								decisaoContinuar = ler.nextInt();
							}
								
								if(decisaoContinuar == 2) {
									parar = true;
									break;
								}else if (decisaoContinuar == 1){
									System.out.println("Digite 1 para pedra, 2 para papel e 3 para tesouras");
									int jogadaAtual = ler.nextInt();
								
									jogo.verificaVencedor(jogadaAtual);
								}
					}
				}
			}
	}

}
