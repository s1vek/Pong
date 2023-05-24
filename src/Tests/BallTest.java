package Tests;

import Core.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void speedUp() {

        Ball ball = new Ball();

        ball.setxDirection(2);
        ball.setyDirection(2);

        ball.speedUp();

        assertEquals(3, ball.getxDirection());
        assertEquals(3, ball.getyDirection());

    }

    @Test
    void deltaY() {

        Ball ball = new Ball();

        ball.setyDirection(3);

        ball.deltaY();

        assertEquals(-3, ball.getyDirection());

    }

    @Test
    void deltaX() {

        Ball ball = new Ball();

        ball.setyDirection(2);

        ball.deltaX();

        assertEquals(-2, ball.getxDirection());


    }
}