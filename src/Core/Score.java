package Core;

import Constants.Values;
import PlayerVsPlayer.Pvp;

import java.awt.*;

public class Score {

    private int p1; // Score of player1

    private int p2; // Score of player2

    private int xp1; // Location on x coordinates of player 1 score

    private int xp2; // Location on x coordinates of player 1 score

    public Score () { // Sets location of both scores to middle

        xp1 = Values.GAME_WIDTH / 2 - 100;
        xp2 = Values.GAME_WIDTH / 2 + 40;


    }

    /**
     * Method for adding score to player 1
     */
    public void p1Goal () {

        p1++;

    }

    /**
     * Method for adding score to player 2
     */
    public void p2Goal () {

        p2++;

    }

    /**
     * Drawing method of Score
     * @param g
     */
    public void draw (Graphics g) {

        g.setColor(Color.white);
        g.setFont(Values.FONT);


        if (p1 < 10) { // Draw player 1 score

            g.drawString(String.valueOf(p1%10), (Values.GAME_WIDTH/2) - 200 , 50);

        } else { // if the score is bigger than 10 it will add another digit to display biggger values

            g.drawString(String.valueOf(p1/10)+String.valueOf(p1%10), (Values.GAME_WIDTH/2)  - 200, 50);

        }

        if (p2 < 10) { // Draw player 2 score

            g.drawString(String.valueOf(p2%10), (Values.GAME_WIDTH/2) + 200, 50);

        } else { // if the score is bigger than 10 it will add another digit to display biggger values

            g.drawString(String.valueOf(p2/10)+String.valueOf(p2%10), (Values.GAME_WIDTH/2) + 200, 50);

        }


    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }
}
