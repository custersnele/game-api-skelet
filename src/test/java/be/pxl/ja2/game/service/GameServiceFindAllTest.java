package be.pxl.ja2.game.service;

import be.pxl.ja2.game.repository.GameDao;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GameServiceFindAllTest {
    @Mock
    private GameDao gameDao;

    @InjectMocks
    private GameService gameService;

    @Before
    public void initTest() {
        MockitoAnnotations.initMocks(this);
    }

    // TODO add tests
}
