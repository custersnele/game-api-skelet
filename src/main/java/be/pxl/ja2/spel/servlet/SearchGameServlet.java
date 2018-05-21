package be.pxl.ja2.spel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.pxl.ja2.spel.model.Game;
import be.pxl.ja2.spel.model.GameEvaluation;
import be.pxl.ja2.spel.repository.GameDao;
import be.pxl.ja2.spel.util.EntityManagerUtil;


public class SearchGameServlet extends HttpServlet {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
