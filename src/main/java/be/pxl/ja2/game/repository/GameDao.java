package be.pxl.ja2.game.repository;

import be.pxl.ja2.game.model.Game;

import javax.persistence.EntityManager;
import java.util.List;

public class GameDao {
    private EntityManager entityManager;

    public GameDao(EntityManager em) {
        entityManager = em;
    }

    public Game saveGame(Game game) {
        // TODO implement
        return null;
    }

    public void deleteGame(Long id) {
        // TODO implement
    }

    public List<Game> findAll() {
        // TODO implement
        return null;
    }

    public Game findByName(String name) {
        // TODO implement
        return null;
    }

    public Game getById(Long gameId) {
        // TODO implement
        return null;
    }
}
