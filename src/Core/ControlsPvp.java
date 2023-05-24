package Core;

import PlayerVsPlayer.PvpFrame;
import PlayerVsPlayer.PvpPanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlsPvp implements KeyListener { // Controls of PvP mode

    // In a Racket Class there are declared 2 boolean values called "moveUp" and "moveDown", I am using these values for moving the Rackets
    // Also in a PvP mode there 2 players so, I have decided to separate controls for PvP and SinglePlayer to make everything controls less confusing

    private PvpPanel panel;

    private PvpFrame frame;


    public ControlsPvp (PvpPanel panel) {

        this.panel = panel;

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()){
            case KeyEvent.VK_W: panel.getPlayer1().setMoveUp(true); break;
            case KeyEvent.VK_UP: panel.getPlayer2().setMoveUp(true); break;
            case KeyEvent.VK_S: panel.getPlayer1().setMoveDown(true); break;
            case KeyEvent.VK_DOWN: panel.getPlayer2().setMoveDown(true); break;
            case KeyEvent.VK_ESCAPE: Menu m = new Menu(); break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        switch(e.getKeyCode()){
            case KeyEvent.VK_W: panel.getPlayer1().setMoveUp(false); break;
            case KeyEvent.VK_UP: panel.getPlayer2().setMoveUp(false); break;
            case KeyEvent.VK_S: panel.getPlayer1().setMoveDown(false); break;
            case KeyEvent.VK_DOWN: panel.getPlayer2().setMoveDown(false); break;
            case KeyEvent.VK_ESCAPE: Menu m = new Menu(); break;
        }


    }
}
