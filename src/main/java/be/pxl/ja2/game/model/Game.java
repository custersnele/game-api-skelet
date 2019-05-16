package be.pxl.ja2.game.model;

import org.apache.johnzon.mapper.JohnzonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private long id;
    private String name;
    private int playingTime;
    private int numberOfPlayers;
    private List<GameEvaluation> evaluations = new ArrayList<>();

    protected Game() {
        // JPA
    }

    public Game(String name, int playingTime, int numberOfPlayers) {
        this.name = name;
        setPlayingTime(playingTime);
        setNumberOfPlayers(numberOfPlayers);
    }

    public int getNumberOfEvaluations() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String naam) {
        this.name = naam;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        if (playingTime < 0) {
           throw new IllegalArgumentException("Invalid playingTime: playingTime cannot be less than zero.");
        }
        this.playingTime = playingTime;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers < 0) {
            throw new IllegalArgumentException("Invalid numberOfPlayers: numberOfPlayers cannot be less than zero.");
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    @JohnzonIgnore
    public List<GameEvaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<GameEvaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public long getId() {
        return id;
    }

    public double getAverageScore() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", playingTime=" + playingTime +
                ", numberOfPlayers=" + numberOfPlayers +
                '}';
    }
}
