package Singleplayer;

import MenuUI.MenuFrame;
import MenuUI.MenuPanel;
import PlayerVsPlayer.Pvp;
import PlayerVsPlayer.PvpPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingleplayerFrame {

    private JFrame frame;

    public SingleplayerFrame(SingleplayerPanel singleplayerPanel) {

        this.frame = new JFrame();

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);
        this.frame.setTitle("Pong - Single Player");

        this.frame.add(singleplayerPanel);

        this.frame.pack();
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);

        singleplayerPanel.startGameLoop();

        //-----------------------------------------------------------------------//
        // // Menu button actionListener to open Menu back and close current game
        singleplayerPanel.menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == singleplayerPanel.menu) {

                    frame.dispose();
                    MenuFrame m = new MenuFrame(new MenuPanel());

                }

            }
        });


    }
}



