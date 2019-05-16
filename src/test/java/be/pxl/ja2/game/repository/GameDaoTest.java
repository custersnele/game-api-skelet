package be.pxl.ja2.game.repository;

import be.pxl.ja2.game.model.Game;
import be.pxl.ja2.game.repository.util.JPAHibernateTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GameDaoTest extends JPAHibernateTest {
    private static final String GAME_NAME = "Uno";
    private static GameDao gameDao = new GameDao(em);

    @BeforeClass
    public static void initData() {
        gameDao.saveGame(new Game(GAME_NAME, 20, 5));
        gameDao.saveGame(new Game("Risk", 120, 8));
    }

    // TODO add tests
}
