package be.pxl.ja2.spel.rest;

import be.pxl.ja2.spel.model.Game;
import be.pxl.ja2.spel.model.GameEvaluation;
import be.pxl.ja2.spel.repository.GameDao;
import be.pxl.ja2.spel.repository.GameEvaluationDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameRestTest {
    @Mock
    private GameDao gameDao;
    @Mock
    private GameEvaluationDao gameEvaluationDao;
    @InjectMocks
    private GameRest gameRest;

    @Before
    public void initTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAllCallsGameDaoFindAll() {

    }

    @Test
    public void createGameEvaluationCallsGameEvaluationDaoSaveGameEvaluationWithTimestampedGameEvaluation() {

    }
}
