package br.com.eduardo.tictactoe;

public class Board {
	protected char[][] tabuleiro = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	public void Mostrar() {
		System.out.println("   0   1   2");
		for (int i = 0; i < 3; i++) {
			System.out.print(i);
			for (int j = 0; j < 3; j++) {
				System.out.printf("[ " + tabuleiro[i][j] + "]");
			}
			System.out.println("\n");
		}
	}

	public boolean zerarBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
		return true;
	}

	public boolean isEmpty() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] != 'X') {

				}
			}
		}
		return false;
	}

}
