package be.pxl.ja2.spel.repository;

import be.pxl.ja2.spel.model.Game;
import be.pxl.ja2.spel.model.GameEvaluation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class GameEvaluationDao {
    private EntityManager entityManager;

    public GameEvaluationDao(EntityManager em) {
        entityManager = em;
    }


}
