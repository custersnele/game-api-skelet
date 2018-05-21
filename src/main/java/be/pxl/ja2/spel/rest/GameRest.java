package be.pxl.ja2.spel.rest;

import be.pxl.ja2.spel.model.Game;
import be.pxl.ja2.spel.model.GameEvaluation;
import be.pxl.ja2.spel.repository.GameDao;
import be.pxl.ja2.spel.repository.GameEvaluationDao;
import be.pxl.ja2.spel.util.EntityManagerUtil;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.util.List;

@Path("/game")
public class GameRest {

    private GameDao gameDao;
    private GameEvaluationDao gameEvaluationDao;

    public GameRest() {
        gameDao = new GameDao(EntityManagerUtil.createEntityManager());
        gameEvaluationDao = new GameEvaluationDao(EntityManagerUtil.createEntityManager());
    }
}
