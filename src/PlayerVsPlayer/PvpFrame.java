package PlayerVsPlayer;

import Constants.Values;
import MenuUI.MenuFrame;
import MenuUI.MenuPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PvpFrame  {

    private JFrame frame;

    private JButton MenuButton;

    public PvpFrame (PvpPanel pvp) {

        this.frame = new JFrame();

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);
        this.frame.setTitle("Pong - Player vs Player");

        this.frame.add(pvp);

        this.frame.pack();
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);

        pvp.startGameLoop();

        //-----------------------------------------------------------------------//
        // Menu button actionListener to open Menu back and close current game
        pvp.menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == pvp.menu) {

                    frame.dispose();
                    MenuFrame m = new MenuFrame(new MenuPanel());

                }

            }
        });

    }
}
