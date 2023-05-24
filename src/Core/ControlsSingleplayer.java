package Core;

import Singleplayer.SingleplayerPanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlsSingleplayer implements KeyListener {

    // In a Racket Class there are 2 declared boolean values called "moveUp" and "moveDown", I am using these values for moving the Rackets
    private SingleplayerPanel panel;

    public ControlsSingleplayer (SingleplayerPanel panel) {

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
            case KeyEvent.VK_S: panel.getPlayer1().setMoveDown(true); break;
            case KeyEvent.VK_ESCAPE: Menu m = new Menu(); break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        switch(e.getKeyCode()){
            case KeyEvent.VK_W: panel.getPlayer1().setMoveUp(false); break;
            case KeyEvent.VK_S: panel.getPlayer1().setMoveDown(false); break;
            case KeyEvent.VK_ESCAPE: Menu m = new Menu(); break;
        }

    }
}
