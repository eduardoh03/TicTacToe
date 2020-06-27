package br.com.eduardo.tictactoe.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.eduardo.tictactoe.Game;
import br.com.eduardo.tictactoe.Move;
import br.com.eduardo.tictactoe.Position;
import br.com.eduardo.tictactoe.Exception.InvalidPositionException;
import br.com.eduardo.tictactoe.Exception.InvalidSymbolException;

public class VictoryTest {

	private Game g;

	@Before
	public void setup() {
		g = new Game();
	}

	@Test
	public void testHasWinnerHorizontal1() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 0)));
		g.add(new Move('X', new Position(1, 0)));
		g.add(new Move('O', new Position(0, 1)));
		g.add(new Move('X', new Position(2, 0)));
		g.add(new Move('O', new Position(0, 2)));
		assertTrue(g.hasWinner());
	}
	
	@Test
	public void testHasWinnerHorizontal1X() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 0)));
		g.add(new Move('X', new Position(1, 0)));
		g.add(new Move('O', new Position(0, 1)));
		g.add(new Move('X', new Position(1, 1)));
		g.add(new Move('O', new Position(2, 2)));
		g.add(new Move('X', new Position(1, 2)));
		assertTrue(g.hasWinner());
	}

	@Test
	public void testHasWinnerHorizontal2() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(1, 0)));
		g.add(new Move('X', new Position(0, 0)));
		g.add(new Move('O', new Position(1, 1)));
		g.add(new Move('X', new Position(2, 0)));
		g.add(new Move('O', new Position(1, 2)));
		assertTrue(g.hasWinner());
	}

	@Test
	public void testHasWinnerHorizontal3() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(2, 0)));
		g.add(new Move('X', new Position(1, 0)));
		g.add(new Move('O', new Position(2, 1)));
		g.add(new Move('X', new Position(0, 0)));
		g.add(new Move('O', new Position(2, 2)));
		assertTrue(g.hasWinner());
	}

	@Test
	public void testHasWinnerVertical1() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 0)));
		g.add(new Move('X', new Position(0, 1)));
		g.add(new Move('O', new Position(1, 0)));
		g.add(new Move('X', new Position(2, 2)));
		g.add(new Move('O', new Position(2, 0)));
		assertTrue(g.hasWinner());
	}

	@Test
	public void testHasWinnerVertical2() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 1)));
		g.add(new Move('X', new Position(0, 2)));
		g.add(new Move('O', new Position(1, 1)));
		g.add(new Move('X', new Position(2, 2)));
		g.add(new Move('O', new Position(2, 1)));
		assertTrue(g.hasWinner());
	}

	@Test
	public void testHasWinnerVertical3() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 2)));
		g.add(new Move('X', new Position(0, 1)));
		g.add(new Move('O', new Position(1, 2)));
		g.add(new Move('X', new Position(2, 1)));
		g.add(new Move('O', new Position(2, 2)));
		assertTrue(g.hasWinner());
	}

	@Test
	public void testHasWinnerDiagonal1() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 0)));
		g.add(new Move('X', new Position(0, 1)));
		g.add(new Move('O', new Position(1, 1)));
		g.add(new Move('X', new Position(2, 0)));
		g.add(new Move('O', new Position(2, 2)));
		assertTrue(g.hasWinner());
	}

	@Test
	public void testHasWinnerDiagonal2() throws InvalidPositionException,
			InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 2)));
		g.add(new Move('X', new Position(0, 1)));
		g.add(new Move('O', new Position(1, 1)));
		g.add(new Move('X', new Position(2, 2)));
		g.add(new Move('O', new Position(2, 0)));
		assertTrue(g.hasWinner());
	}
}
