package br.com.eduardo.tictactoe;

import java.io.IOException;

public class InvalidPositionException extends Exception {
	public InvalidPositionException(IOException e) {
		System.err.println("ERROR, POSICAO INVALIDA");
		
	}
	public InvalidPositionException(String m) {
		System.err.println(m);
	}
}
