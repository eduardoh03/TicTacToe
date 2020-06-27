package br.com.eduardo.tictactoe;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InvalidPositionException{
		boolean jogarnovamente = false;
		do {
			Game gm = new Game();
			gm.init();
			Position ps = new Position();
			Move mv = new Move();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("===TIC TAC TOE===");
			gm.getBoard().Mostrar();

			for (int rodada = 0; rodada < 9; rodada++) {
				System.out.println("Informe a posicao:");
				int linhal, colunac;
				
				String pos = sc.nextLine();
				
				String[] vect = pos.split(",");

				
				linhal = Integer.parseInt(vect[0]);
				colunac = Integer.parseInt(vect[1]);
				if(linhal < 0 || linhal >2 && colunac<0 || colunac>2) 
					throw new InvalidPositionException("Posicao invalida");
				
				ps.defPosition(linhal, colunac);

				mv.defMove(gm.quemEOProximo(), ps);

				if (gm.check(mv)) {
					gm.add(mv);

				} else {
					gm.add(mv);

				}
				gm.getBoard().Mostrar();
				gm.setCont(gm.getCont() + 1);
				if (gm.hasWinner() == 'X' || gm.hasWinner() == 'O') {
					System.out.println("JOGADOR " + gm.hasWinner() + " venceu");
					break;
				}
				if (gm.hasDraw(rodada + 1)) {
					System.out.println("DEU VELHA");
					break;
				}
			}
			gm.zerarpartida();
			System.out.println("Gostaria de Jogar Novamente?\n1.SIM \n2.NAO");

			int opcao1 = sc.nextInt();

			if (opcao1 == 1) {
				jogarnovamente = true;
			} else if (opcao1 != 1) {
				System.out.println("===FIM DE JOGO===");
				jogarnovamente = false;

			}

		} while (jogarnovamente == true);

	}

}
