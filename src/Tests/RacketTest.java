package Tests;

import Constants.Values;
import Core.Racket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacketTest {

    @Test
    void update() { // 1. case with boolean values

        Racket racket = new Racket(30, Values.RACKET_HEIGHT / 2, Values.RACKET_WIDTH, Values.RACKET_HEIGHT,1);

        racket.setMoveUp(true);
        racket.setMoveDown(false);

        int slidingSpeed = 4;

        racket.setY(20);

        racket.update();

        assertEquals(16, racket.getY());


    }

    @Test
    void update2() { // 2. case with boolean values

        Racket racket = new Racket(30, Values.RACKET_HEIGHT / 2, Values.RACKET_WIDTH, Values.RACKET_HEIGHT,1);

        racket.setMoveUp(false);
        racket.setMoveDown(true);

        int slidingSpeed = 4;

        racket.setY(16);

        racket.update();

        assertEquals(20, racket.getY());


    }

    @Test
    void update3 () { // 3. case checking outside of game borders

        Racket racket = new Racket(30, Values.RACKET_HEIGHT / 2, Values.RACKET_WIDTH, Values.RACKET_HEIGHT,1);

        racket.setMoveUp(false);
        racket.setMoveDown(false);

        racket.setY(-1);

        racket.update();

        assertEquals(0, racket.getY());

    }

}