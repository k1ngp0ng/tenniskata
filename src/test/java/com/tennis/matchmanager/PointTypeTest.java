package com.tennis.matchmanager;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTypeTest {

    @Test
    public void add_point_should_give_the_expected_point_type() {
        PointType love = PointType.LOVE;
        PointType nextPointType = love.next();
        assertThat(nextPointType).isEqualTo(PointType.FIFTEEN);

        nextPointType = nextPointType.next();
        assertThat(nextPointType).isEqualTo(PointType.THIRTY);

        nextPointType = nextPointType.next();
        assertThat(nextPointType).isEqualTo(PointType.FORTY);

        nextPointType = nextPointType.next();
        assertThat(nextPointType).isEqualTo(PointType.GAME);

        nextPointType = nextPointType.next();
        assertThat(nextPointType).isEqualTo(PointType.GAME);

    }

}