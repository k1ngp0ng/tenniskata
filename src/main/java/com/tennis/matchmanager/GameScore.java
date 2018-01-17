package com.tennis.matchmanager;

import java.util.stream.Stream;

import static com.tennis.matchmanager.PointType.*;

public class GameScore {

    private PointType player1Point;
    private PointType player2Point;

    public GameScore() {
        this.player1Point = LOVE;
        this.player2Point = LOVE;
    }

    private boolean canAddPoint() {
        return Stream.of(player1Point, player2Point).noneMatch(pointType -> GAME == pointType);
    }

    public void addPlayer1Point() {
        if (canAddPoint()) {
            player1Point = player1Point.next();
        }
    }

    public void addPlayer2Point() {
        if (canAddPoint()) {
            player2Point = player2Point.next();
        }
    }

    public boolean isFisnihed() {
        return (player1Point == GAME || player2Point == GAME);
    }

    public PointType player1Score() {
        return player1Point;
    }

    public PointType player2Score() {
        return player2Point;
    }

    public String toString() {
        return String.format("P1 : %s\nP2 : %s", player1Point, player2Point);
    }

}
