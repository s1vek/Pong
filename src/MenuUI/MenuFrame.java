package MenuUI;

import Constants.Values;

import PlayerVsPlayer.Pvp;
import Singleplayer.Singleplayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame  {

    private JFrame frame;

    public MenuFrame (MenuPanel menu) {

        this.frame = new JFrame();

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);
        this.frame.setTitle("Pong - Menu");

        this.frame.add(menu);

        this.frame.pack();
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);


        //-----------------------------------------------------------------------//
        // Player vs player button actionlistener to open Player vs Player mode
        menu.playerVsPlayer.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if(e.getSource() == menu.playerVsPlayer) {

                    frame.dispose();
                    Pvp pvp = new Pvp();

                }

            }
        }
        );

        // Quit button actionListener to close everything
        menu.quit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        }
        );

        // Singleplayer button actionListener to open Singleplayer mode
        menu.singlePlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                Singleplayer singleplayer = new Singleplayer();

            }
        });


    }



}
