package be.pxl.ja2.spel.repository;

import be.pxl.ja2.spel.model.Game;
import be.pxl.ja2.spel.repository.util.JPAHibernateTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GameDaoTest extends JPAHibernateTest {
    private static final String GAME_NAME = "Uno";
    private static GameDao gameDao = new GameDao(em);

    @BeforeClass
    public static void initData() {
        gameDao.saveGame(new Game(GAME_NAME, 20, 5));
        gameDao.saveGame(new Game("Risk", 120, 8));
    }

    @Test
    public void gameIsSavedCorrectly() {

    }

    @Test
    public void retrieveGameByName() {

    }

    @Test
    public void findAllGames() {

    }
}
