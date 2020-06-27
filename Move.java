package br.com.eduardo.tictactoe;

public class Move {
	public char simbolo;
	public Position posicao;

	public void defMove(char simbolo, Position posicao) {
		
		this.simbolo = simbolo;
		this.posicao = posicao;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public Position getPosicao() {
		return posicao;
	}

	public void setPosicao(Position posicao) {
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return this.simbolo + "@" + this.posicao;
	}

}
