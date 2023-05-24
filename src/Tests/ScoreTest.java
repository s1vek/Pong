package Tests;

import Core.Score;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {

    @Test
    void p1Goal() {

        Score score = new Score();

        score.setP1(1);

        score.p1Goal();

        assertEquals(2, score.getP1());

    }

    @Test
    void p2Goal() {

        Score score = new Score();

        score.setP2(2);

        score.p2Goal();

        assertEquals(3, score.getP2());

    }
}