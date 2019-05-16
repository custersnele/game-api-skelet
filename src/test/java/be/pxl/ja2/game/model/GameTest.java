package be.pxl.ja2.game.model;

import org.junit.Before;

public class GameTest {
    public static final String RUMIKUB = "Rumikub";
    private Game game;

    @Before
    public void setup() {
        game = new Game(RUMIKUB, 4, 45);
    }

    // TODO add tests
}
