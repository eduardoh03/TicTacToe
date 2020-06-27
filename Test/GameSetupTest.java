package br.com.eduardo.tictactoe.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.eduardo.tictactoe.Game;

public class GameSetupTest {

	private Game g;

	@Before
	public void setup() {
		g = new Game();
	}

	@Test
	public void testEmptyGameAtStart() {
		g.init();
		assertTrue(g.getBoard().isEmpty());
	}

}
