package Core;

import Constants.Values;

import java.awt.*;

public class AI extends Object{ // Class for creating AI racket and his functionality

    private Ball b;

    public AI (int x, int y, int width, int height, Ball ball) { // Constructor for setting size of racket

        super(x,y,width,height);

        b = ball;

    }


    /**
     * Update method of AI racket, tracking Y coordinates
     */
    @Override
    public void update() {

        y = (int) b.getY() + Values.BALL_SIZE  - 1;

    }

    /**
     * Cords method used later for collisions with ball
     * @return
     */
    @Override
    public Rectangle cords() {

        return new Rectangle(x,y,width,height);

    }

    /**
     * Drawing method of AI racket
     * @param g
     */
    public void draw (Graphics g) {

        g.setColor(Color.white);
        g.fillRect(x,y, Values.RACKET_WIDTH, Values.RACKET_HEIGHT);

    }
}
