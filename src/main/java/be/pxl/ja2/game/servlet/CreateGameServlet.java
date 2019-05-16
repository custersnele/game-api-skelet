package be.pxl.ja2.game.servlet;

import be.pxl.ja2.game.exceptions.NameAlreadyInUseException;
import be.pxl.ja2.game.model.Game;
import be.pxl.ja2.game.service.GameService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateGame", value = "/CreateGame")
public class CreateGameServlet extends HttpServlet {

    private GameService gameService;

    @Override
    public void init() throws ServletException {
        super.init();
        gameService = new GameService();
    }

    // TODO implement
}
