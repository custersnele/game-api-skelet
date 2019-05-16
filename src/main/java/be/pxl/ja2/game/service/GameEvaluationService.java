package be.pxl.ja2.game.service;

import be.pxl.ja2.game.exceptions.InvalidEvaluationException;
import be.pxl.ja2.game.repository.GameEvaluationDao;
import be.pxl.ja2.game.rest.EvaluationModel;
import be.pxl.ja2.game.util.EntityManagerUtil;

public class GameEvaluationService {
    private GameService gameService;
    private GameEvaluationDao gameEvaluationDao;


    public GameEvaluationService() {
        gameService = new GameService();
        gameEvaluationDao = new GameEvaluationDao(EntityManagerUtil.createEntityManager());
    }

    public void createEvaluation(Long gameId, EvaluationModel evaluationModel) throws InvalidEvaluationException {
        // TODO implement
    }
}
