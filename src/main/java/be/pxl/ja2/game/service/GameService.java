package be.pxl.ja2.game.service;

import be.pxl.ja2.game.exceptions.NameAlreadyInUseException;
import be.pxl.ja2.game.model.Game;
import be.pxl.ja2.game.repository.GameDao;
import be.pxl.ja2.game.util.EntityManagerUtil;

import java.util.List;

public class GameService {
    private GameDao gameDao;

    public GameService() {
        gameDao = new GameDao(EntityManagerUtil.createEntityManager());
    }

    public Game addGame(Game game) throws NameAlreadyInUseException {
        // TODO implement
        return null;
    }

    public List<Game> findAll() {
        // TODO implement
        return null;
    }

    public Game getById(Long gameId) {
        // TODO implement
        return null;
    }
}
