package com.tennis.matchmanager;

import java.util.ArrayList;
import java.util.List;

public enum PointType {

    LOVE(0), FIFTEEN(1), THIRTY(2), FORTY(3), GAME(4);

    private final int index;
    private static final List<PointType> pointTypes = new ArrayList<>();

    PointType(int index) {
        this.index = index;
    }

    static {
        pointTypes.add(LOVE);
        pointTypes.add(FIFTEEN);
        pointTypes.add(THIRTY);
        pointTypes.add(FORTY);
        pointTypes.add(GAME);
    }

    public int index() {
        return index;
    }

    public PointType next() {
        if (index <=3) {
            return pointTypes.get(index+1);
        }
        return GAME;
    }

}
