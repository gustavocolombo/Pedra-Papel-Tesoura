package br.com.ufc.es.pds.exec;
import java.util.Scanner;

import br.com.ufc.es.pds.model.View;

public class Principal {
	
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int escolhaJogador;
		
		View view =  new View();
			view.menu();
			escolhaJogador = ler.nextInt();
			view.verificaJogada(escolhaJogador);
			view.chamaJogada(escolhaJogador);
	}
}
