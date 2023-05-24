package Core;

import Constants.Values;
import Core.Object;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Racket extends Object {

    public int slidingSpeed = 4; // Sliding speed of Rackets

    public int player; // Identification of player (player 1, player 2....)

    private boolean moveUp;

    private boolean moveDown;

    public Racket(int x, int y, int width, int height, int player) {

        super(x,y,width,height);

        this.player = player;

    }

    /**
     * Update method for Racket
     */
    @Override
    public void update() {

        if( moveUp && !moveDown){ // If boolean value is moveUp set to true and boolean value set to false => racket is going to move up and that means that y will subtract

            y -= slidingSpeed;

        } else if (!moveUp && moveDown) { // If boolean value moveUp is set to false and boolean value moveDown set to true => racket is going to move up and that means that y will add

            y += slidingSpeed;

        }
        if( y <= 0)  { // Checks if y values is not less than 0 because of game borders

            y = 0;

        }
        if( y >= Values.GAME_HEIGHT- 100) { // Checks if y value is not bigger than game height because of game borders

            y = Values.GAME_HEIGHT - 100;

        }

    }


    /**
     * Drawing method of Racket
     * @param g
     */
    public void draw(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(x, y, Values.RACKET_WIDTH, Values.RACKET_HEIGHT);

    }

    /**
     * Cords method used later for collisions
     * @return
     */
    @Override
    public Rectangle cords() {

        return new Rectangle(x,y,width,height);

    }

    // Getters and Setters for boolean values
    public void setMoveUp(boolean moveUp) {
        this.moveUp = moveUp;
    }


    public void setMoveDown(boolean moveDown) {
        this.moveDown = moveDown;
    }
}
