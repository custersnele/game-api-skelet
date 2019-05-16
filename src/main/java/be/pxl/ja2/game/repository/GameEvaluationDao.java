package be.pxl.ja2.game.repository;

import be.pxl.ja2.game.model.GameEvaluation;

import javax.persistence.EntityManager;

public class GameEvaluationDao {
    private EntityManager entityManager;

    public GameEvaluationDao(EntityManager em) {
        entityManager = em;
    }

    public GameEvaluation saveGameEvaluatie(GameEvaluation gameEvaluation) {
        // TODO implement
        return null;
    }
}
