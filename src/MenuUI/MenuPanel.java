package MenuUI;

import Constants.Values;
import PlayerVsPlayer.Pvp;
import Singleplayer.Singleplayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {

    public JButton singlePlayer;

    public JButton playerVsPlayer;

    public JButton quit;

    private JLabel title;

    private JPanel leftRacket;

    private JPanel rightRacket;


    public MenuPanel () {

        //Setting of the Menu UI
        this.setPreferredSize(new Dimension(Values.MENU_WIDTH, Values.MENU_HEIGHT));
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

        setupButtons();
        this.add(singlePlayer);
        this.add(playerVsPlayer);
        this.add(quit);

        setupTitle();
        this.add(title);

        setupRackets();
        this.add(leftRacket);
        this.add(rightRacket);

    }

    /**
     * Setup method for racket which are located on the sides of the menu screen
     */
    public void setupRackets() {

        leftRacket = new JPanel();
        leftRacket.setBounds(0, 350, 30, 200);
        leftRacket.setBackground(Color.red);

        rightRacket = new JPanel();
        rightRacket.setBounds(970, 350, 30, 200);
        rightRacket.setBackground(Color.blue);


    }

    /**
     * Setup method for buttons
     */
    public void setupButtons() {

        singlePlayer = new JButton();
        singlePlayer.setText("Single Player");
        singlePlayer.setBounds(300,350,400,100);
        singlePlayer.setBackground(Color.white);
        singlePlayer.setFocusable(false);

        playerVsPlayer = new JButton();
        playerVsPlayer.setText("Player vs Player");
        playerVsPlayer.setBounds(300,550,400,100);
        playerVsPlayer.setBackground(Color.white);
        playerVsPlayer.setFocusable(false);

        quit = new JButton();
        quit.setText("Quit");
        quit.setBounds(300,750,400,100);
        quit.setBackground(Color.white);
        quit.setFocusable(false);



    }

    /**
     * Setup method for the title
     */
    public void setupTitle () {

        title = new JLabel("PONG");
        title.setFont(new java.awt.Font("Arial", Font.BOLD, 100));
        title.setForeground(Color.WHITE);
        title.setBounds(350, 100, 400, 200);

    }



}
