package com.tennis.matchmanager;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

public class ScoreTest {

    @Test
    public void test_create_score_should_give_empty_score_for_both_players() {
        GameScore score = new GameScore();
        System.out.println(score);
    }

    @Test
    public void test_a_player_win_point_should_inscrease_score() {
        GameScore score = new GameScore();
        score.addPlayer1Point();
        assertThat(score.player1Score()).isEqualTo(PointType.FIFTEEN);
    }

    @Test
    public void test_a_player_win_3_points_should_have_score_to_forty() {
        GameScore score = new GameScore();
        IntStream.range(1,4).forEach(i -> score.addPlayer2Point());
        assertThat(score.player2Score()).isEqualTo(PointType.FORTY);
    }

    @Test
    public void test_a_player_win_4_points_should_have_win_the_game() {
        GameScore score = new GameScore();
        IntStream.range(1,5).forEach(i -> score.addPlayer2Point());
        assertThat(score.player2Score()).isEqualTo(PointType.GAME);
    }

}