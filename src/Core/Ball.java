package Core;



import Constants.Values;

import java.awt.*;
import java.util.Random;

public class Ball extends Object {

    public int xDirection;

    public int yDirection;

    private Random random;

    public Ball (){
        super (Values.GAME_WIDTH / 2, Values.GAME_HEIGHT / 2, Values.BALL_SIZE, Values.BALL_SIZE);


        resetBall();

    }

    /**
     * Method for resetting location of ball to the middle of screen and also randomly selecting direction ball (right or left)
     */
    public void resetBall() {

        x = Values.GAME_WIDTH / 2;
        y = Values.GAME_HEIGHT / 2;

        random = new Random();
        xDirection = random.nextInt(2); // Generates random number between 1 and 0

        if (xDirection == 0) { // If x is equal to 0 than x is set to -1 and the ball is going to move to the left

            xDirection--;

        } else { // Otherwise go right

            xDirection++;

        }

        yDirection = random.nextInt(2); // Generates random number between 1 and 0

        if (yDirection == 0) { // If y is equal to 0 than x is set to -1 and the ball is going to move to the up


            yDirection--;

        } else { // Otherwise go down

            yDirection++;

        }

    }

    /**
     * Speed up method for increasing difficulty throughout game
     */
    public void speedUp () {

        yDirection++;
        xDirection++;

    }

    /**
     * Update method of Racket
     */
    @Override
    public void update() {

        y += yDirection;
        x += xDirection;

    }

    /**
     * Cords method used later for collisions with rackets
     * @return
     */
    @Override
    public Rectangle cords() {

        return new Rectangle(x,y,width,height);

    }

    /**
     * Method for changing direction Y coordinates to an opposite value
     */
    public void deltaY () {

        yDirection *= -1;

    }

    /**
     * Method for changing direction X coordinates to an opposite value
     */
    public void deltaX () {

        xDirection *= -1;

    }

    /**
     * Drawing method of Ball
     * @param g
     */
    public void draw (Graphics g) {

        g.setColor(Color.ORANGE);
        g.fillOval(x,y,width,height);

    }

    public int getxDirection() {
        return xDirection;
    }

    public void setxDirection(int xDirection) {
        this.xDirection = xDirection;
    }

    public int getyDirection() {
        return yDirection;
    }

    public void setyDirection(int yDirection) {
        this.yDirection = yDirection;
    }
}
