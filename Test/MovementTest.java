package br.com.eduardo.tictactoe.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.eduardo.tictactoe.InvalidPositionException;
import br.com.eduardo.tictactoe.InvalidSymbolException;
import br.com.eduardo.tictactoe.Game;
import br.com.eduardo.tictactoe.Move;
import br.com.eduardo.tictactoe.Position;

public class MovementTest {

	private Game g;

	@Before
	public void setup() {
		g = new Game();
	}

	private boolean verificaJogadaNaPosicao(Character symbol, int x, int y)
			throws InvalidPositionException, InvalidSymbolException {
		// Dado...
		g.init();
		Position aPosition = new Position();
		Move aMove = new Move();
		Character aSymbol = symbol;		
		aPosition.defPosition(x, y);
		aMove.defMove(aSymbol, aPosition);
		// quando
		return g.check(aMove);
	}

	@Test
	public void testValidMove00() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 0, 0));
	}

	@Test
	public void testValidMove01() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 0, 1));
	}

	@Test
	public void testValidMove02() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 0, 2));
	}

	@Test
	public void testValidMove10() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 1, 0));
	}

	@Test
	public void testValidMove11() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 1, 1));
	}

	@Test
	public void testValidMove12() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 1, 2));
	}

	@Test
	public void testValidMove20() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 2, 0));
	}

	@Test
	public void testValidMove21() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 2, 1));
	}

	@Test
	public void testValidMove22() throws InvalidPositionException, InvalidSymbolException {
		assertTrue(verificaJogadaNaPosicao('O', 2, 2));
	}
/*NAO SE APLICA AO JOGO(SELECAO AUTOMATICA)
	@Test(expected = InvalidPositionException.class)
	public void testInvalidPositionMoveX00() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		g.add(new Move(new Position(0, 0),'O'));

		Character aSymbol = 'X';
		Position aPosition = new Position(0, 0);
		g.check(new Move(aSymbol, aPosition));
	}

	@Test(expected = InvalidSymbolException.class)
	public void testInvalidPlayerMoveX00() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		g.add(new Move('X', new Position(0, 0)));

		Character aSymbol = 'X';
		Position aPosition = new Position(0, 2);
		Move aMove = new Move(aSymbol, aPosition);
		g.check(aMove);
	}

	@Test(expected = InvalidSymbolException.class)
	public void testInvalidPlayerMoveO00() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 0)));

		Character aSymbol = 'O';
		Position aPosition = new Position(0, 2);
		Move aMove = new Move(aSymbol, aPosition);
		g.check(aMove);
	}
*/
	@Test(expected = InvalidPositionException.class)
	public void testExceptionInvalidPositionMoveX00() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		Move aMove = new Move();	
		Position aPosition = new Position();
		g.add(aMove.defMove('O', aPosition.defPosition(0, 0)));

		Character aSymbol = 'X';
		Position aPosition = new Position(0, 0);
		Move aMove = new Move(aSymbol, aPosition);
		g.add(aMove);
	}

	@Test(expected = InvalidPositionException.class)
	public void testExceptionInvalidPositionMoveY() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(2, 3)));
	}

	@Test(expected = InvalidPositionException.class)
	public void testExceptionInvalidPositionMoveX() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(3, 2)));
	}

	@Test(expected = InvalidPositionException.class)
	public void testExceptionInvalidPositionMoveXY() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(3, 3)));
	}

/*	NAO SE APLICA AO JOGO(SELECAO AUTOMATICA)
 * @Test(expected = InvalidSymbolException.class)
	public void testExceptionInvalidPlayerMoveO00() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		g.add(new Move('O', new Position(0, 0)));

		Character aSymbol = 'O';
		Position aPosition = new Position(0, 1);
		Move aMove = new Move(aSymbol, aPosition);
		g.add(aMove);
	}

	@Test(expected = InvalidSymbolException.class)
	public void testExceptionInvalidPlayerMoveX00() throws InvalidPositionException, InvalidSymbolException {
		g.init();
		g.add(new Move('X', new Position(0, 0)));

		Character aSymbol = 'X';
		Position aPosition = new Position(0, 1);
		Move aMove = new Move(aSymbol, aPosition);
		g.add(aMove);
	}*/

}
