package br.com.eduardo.tictactoe;

public class Game {

	protected Board board;

	protected int cont = 0;

	public void init() {
		this.board = new Board();
	}

	public void add(Move move) {
		this.board.tabuleiro[move.posicao.getL()][move.posicao.getC()] = move.getSimbolo();
	}

	public char quemEOProximo() {
		if (cont % 2 != 0)
			return 'O';
		else {
			return 'X';
		}
	}

	public char hasWinner() {
		for (int i = 0; i < 3; i++) {
			// vertical

			if (board.tabuleiro[i][0] == 'X' && board.tabuleiro[i][1] == 'X' && board.tabuleiro[i][2] == 'X') {
				return 'X';
			}

			if (board.tabuleiro[i][0] == 'O' && board.tabuleiro[i][1] == 'O' && board.tabuleiro[i][2] == 'O') {
				return 'O';
			}
			// horizontal
			if (board.tabuleiro[0][i] == 'X' && board.tabuleiro[1][i] == 'X' && board.tabuleiro[2][i] == 'X') {
				return 'X';
			}

			if (board.tabuleiro[0][i] == 'O' && board.tabuleiro[1][i] == 'O' && board.tabuleiro[2][i] == 'O') {
				return 'O';
			}
			// diagonal
			if (board.tabuleiro[0][0] == 'O' && board.tabuleiro[1][1] == 'O' && board.tabuleiro[2][2] == 'O') {
				return 'O';
			}
			if (board.tabuleiro[0][2] == 'O' && board.tabuleiro[1][1] == 'O' && board.tabuleiro[2][0] == 'O') {
				return 'O';
			}
			if (board.tabuleiro[0][0] == 'X' && board.tabuleiro[1][1] == 'X' && board.tabuleiro[2][2] == 'X') {
				return 'X';
			}
			if (board.tabuleiro[0][2] == 'X' && board.tabuleiro[1][1] == 'X' && board.tabuleiro[2][0] == 'X') {
				return 'X';
			}

		}

		return 0;

	}

	public boolean check(Move aMove) {
		// try {
		if (board.tabuleiro[aMove.posicao.getL()][aMove.posicao.getC()] == ' ') {
			return true;
		}

		return false;
	}

	public Board getBoard() {
		return this.board;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	// zerar quemEOProximo
	public boolean zerarpartida() {
		this.cont = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board.tabuleiro[i][j] = ' ';
			}
		}
		return true;

	}

	public boolean hasDraw(int rodada) {
		if (rodada == 9 && hasWinner() == 0) {
			return true;
		}
		return false;
	}

}
