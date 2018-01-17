package com.tennis.matchmanager;

public class Game {

    private GameScore score;

    public Game() {
        score = new GameScore();
    }

    public GameScore score() {
        return score;
    }

    public void addPlayer1Point() {
        score.addPlayer1Point();
    }

    public void addPlayer2Point() {
        score.addPlayer2Point();
    }

    public boolean isFinished() {
        return score.isFisnihed();
    }

    @Override
    public String toString() {
        return "Game : \n" + score;
    }
}
