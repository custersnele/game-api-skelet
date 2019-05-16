package be.pxl.ja2.game.servlet;

import be.pxl.ja2.game.service.GameService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.time.format.DateTimeFormatter;


@WebServlet(name = "SearchGame", value = "/SearchGame")
public class SearchGameServlet extends HttpServlet {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private GameService gameService;

    @Override
    public void init() throws ServletException {
        super.init();
        gameService = new GameService();
    }

    // TODO implement
}
