package be.pxl.ja2.game.rest;

import be.pxl.ja2.game.service.GameEvaluationService;
import be.pxl.ja2.game.service.GameService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/games")
public class GameRest {

    private GameService gameService = new GameService();
    private GameEvaluationService gameEvaluationService = new GameEvaluationService();

	// TODO implement extra method

    @POST
    @Path("{gameId}/evaluate")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createGameEvaluation(@PathParam("gameId") Long gameId, EvaluationModel evaluationModel) {
        // TODO implement
    }
}
