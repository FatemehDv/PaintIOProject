package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    public boolean upPressed, downPressed, leftPressed, rightPressed;
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_RIGHT) {
            rightPressed = true;
            leftPressed = false;
            upPressed = false;
            downPressed = false;
        }
        if(code == KeyEvent.VK_LEFT) {
            rightPressed = false;
            leftPressed = true;
            upPressed = false;
            downPressed = false;
        }
        if(code == KeyEvent.VK_UP) {
            rightPressed = false;
            leftPressed = false;
            upPressed = true;
            downPressed = false;
        }
        if(code == KeyEvent.VK_DOWN) {
            rightPressed = false;
            leftPressed = false;
            upPressed = false;
            downPressed = true;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
}
