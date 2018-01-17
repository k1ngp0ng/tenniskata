package com.tennis.matchmanager;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.stream.IntStream;

public class GameTest {

    @Test
    public void create_game_sould_give_void_score() {
        // Given, When
        Game game = new Game();
        Assertions.assertThat(game.score().player1Score()).isEqualTo(PointType.LOVE);
        Assertions.assertThat(game.score().player2Score()).isEqualTo(PointType.LOVE);
    }

    @Test
    public void test_player1_win_4_points_should_have_win_the_game() {
        // Given
        Game game = new Game();
        // When
        IntStream.range(1,5).forEach(i -> game.addPlayer2Point());
        System.out.println(game);
        // Then
        Assertions.assertThat(game.isFinished()).isEqualTo(true);
    }

    @Test
    public void test_player1_win_4_points_should_have_game_not_finsihed() {
        // Given
        Game game = new Game();
        // When
        IntStream.range(1,4).forEach(i -> game.addPlayer2Point());
        System.out.println(game);
        // Then
        Assertions.assertThat(game.isFinished()).isEqualTo(false);

    }

}