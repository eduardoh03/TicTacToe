package br.com.eduardo.tictactoe;

import java.io.IOException;

public class InvalidSymbolException extends Exception {
	public InvalidSymbolException() {
		System.err.println("Caracter invalido");
	}
}
