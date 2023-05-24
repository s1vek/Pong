package Singleplayer;

import PlayerVsPlayer.PvpFrame;
import PlayerVsPlayer.PvpPanel;

public class Singleplayer {

    private SingleplayerFrame frame;

    private SingleplayerPanel panel;

    public Singleplayer () {

        this.panel = new SingleplayerPanel();
        this.frame = new SingleplayerFrame(panel);
        this.panel.requestFocus();

    }

}
