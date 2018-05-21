package be.pxl.ja2.spel.dataimport;

import be.pxl.ja2.spel.model.Game;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportGames {
    private static final List<Game> GAMES = new ArrayList<>();

    static {
        GAMES.add(new Game("Uno", 30, 10));
        GAMES.add(new Game("Weerwolven van Wakkerdam", 45, 18));
        GAMES.add(new Game("Risk Game of Thrones", 120, 5));
    }

    public static void main(String[] args) {

    }
}
