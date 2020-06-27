package br.com.eduardo.tictactoe;

public class Position {
	private int c;
	private int l;
	

	public void defPosition(int a, int b) {
		this.l = a;
		this.c = b;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getC() {
		return c;
	}

	public int getL() {
		return l;
	}

	@Override
	public String toString() {
		return "(" + this.l + "," + this.c + ")";

	}

}
