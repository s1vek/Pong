package PlayerVsPlayer;

import Constants.Values;
import Core.Ball;
import Core.ControlsPvp;
import Core.Racket;
import Core.Score;

import javax.swing.*;

import java.awt.*;

import static Constants.Values.FPS_SET;

public class PvpPanel extends JPanel implements Runnable { // PvP mode login

    private Thread thread;

    private Ball ball;

    private Racket player1;

    private Racket player2;

    private Score score;

    public JButton menu;

    public PvpPanel () { // Constructor where are in-game objects created and also set their values

        ball = new Ball();
        player1 = new Racket(30, Values.RACKET_HEIGHT / 2, Values.RACKET_WIDTH, Values.RACKET_HEIGHT,1);
        player2 = new Racket(Values.GAME_WIDTH - 40, Values.RACKET_HEIGHT / 2, Values.RACKET_WIDTH, Values.RACKET_HEIGHT,2);
        score = new Score();

        setupPanel();
        menuButton();
        this.add(menu);

    }

    /**
     * Menu button method for creating button that opens up starting menu
     */
    private void menuButton() {

        menu = new JButton();
        menu.setText("Back to menu");
        menu.setBackground(Color.white);
        menu.setBounds(300,350,400,100);
        menu.setBackground(Color.white);
        menu.setFocusable(false);

    }

    /**
     * Panel method
     */
    private void setupPanel() {

        this.setPreferredSize(new Dimension(Values.GAME_WIDTH, Values.GAME_HEIGHT));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(new ControlsPvp(this));
        this.setFocusable(true);

    }

    /**
     * Left and right border of screen collisions
     */
    private void leftRightCollisions() {

        if (ball.getX() < - Values.BALL_SIZE) { // if X coordinates of ball are smaller than diameter of ball, then ball resets and player 1 scores goal and that means +1 point to overall score of player 1

            ball.resetBall();
            score.p1Goal();


        }

        if (ball.getX() > Values.GAME_WIDTH) { // if X coordinates of ball are bigger than width of game screen then ball resets and player 2 scores goal and that means +1 point to overall score of player 2

            ball.resetBall();
            score.p2Goal();

        }
    }

    /**
     * Racket and ball collisions
     */
    private void ballRacketCollisions() {

        if (ball.cords().intersects(player1.cords())) { // If ball coordinates intersects coordinates racket of player1, then X coordinates is going to change and also ball is going to move faster to make it more fun

            ball.deltaX();
            ball.speedUp();

        }

        if (ball.cords().intersects(player2.cords())) { // If ball coordinates intersects coordinates racket of player2, then X coordinates is going to change and also ball is going to move faster to make it more fun

            ball.deltaX();


        }

    }

    /**
     * Bottom and top of screen collisions
     */
    private void bottomTopCollisions() {

        if (ball.getY() <= 0 || ball.getY() >= Values.GAME_HEIGHT - Values.BALL_SIZE) { // If the Y coordinates of ball are smaller or equal to 0 or Y coordinates of ball are bigger than height of game screen - diameter of ball
                                                                                        // then, Y coordinates are going to change
            ball.deltaY();

        }

    }

    /**
     * Update method for each in-game object and each collision
     */
    public void update() {

        ball.update();
        player1.update();
        player2.update();

        leftRightCollisions();
        ballRacketCollisions();
        bottomTopCollisions();

    }

    /**
     * Drawing method of each in-game object
     * @param g the <code>Graphics</code> object to protect
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ball.draw(g);
        player1.draw(g);
        player2.draw(g);
        score.draw(g);

    }

    /**
     * Game loop
     */
    @Override
    public void run() {
        double timePerFrame = 1000000000.0 / FPS_SET;
        double timePerTick = 1000000000.0 / Values.TPS_SET;

        long previousTime = System.nanoTime();
        long lastCheck = System.currentTimeMillis();

        int frames = 0;
        int ticks = 0;

        double deltaF = 0;
        double deltaT = 0;

        while (thread != null) {
            long currentTime = System.nanoTime();

            deltaT += (currentTime - previousTime) / timePerTick;
            deltaF += (currentTime - previousTime) / timePerFrame;
            previousTime = currentTime;

            if (deltaT >= 1) {
                update();
                ticks++;
                deltaT--;
            }

            if (deltaF >= 1) {
                repaint();
                frames++;
                deltaF--;
            }

            if (System.currentTimeMillis() - lastCheck >= 1000) {
                lastCheck = System.currentTimeMillis();
                System.out.printf("FPS: %s | TPS: %s%n", frames, ticks);
                frames = 0;
                ticks = 0;
            }


        }

    }

    /**
     * Method for starting game loop
     */
    public void startGameLoop() {

        this.thread = new Thread(this);
        this.thread.start();

    }

    public Racket getPlayer1() {
        return player1;
    }


    public Racket getPlayer2() {
        return player2;
    }

}
