package Entity;

import java.awt.*;

import Entity.Entity;
import org.example.GamePanel;
import org.example.KeyHandler;

public class Player extends Entity {
    GamePanel gamePanel;
    KeyHandler keyHandler;
    public final int screenX;
    public final int screenY;
    public Player(GamePanel gamePanel, KeyHandler keyHandler){
        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;
        screenX = gamePanel.screenWidth / 2 - (gamePanel.tileSize /2);
        screenY = gamePanel.screenHeight / 2 - (gamePanel.tileSize /2);
        setDefaultValues();
    }
    public void setDefaultValues(){
        worldX = gamePanel.tileSize * 30;
        worldY = gamePanel.tileSize * 28;
        speed = 3;
    }
    public void update(){
        if (keyHandler.upPressed)
            worldY -= speed;
        else if (keyHandler.downPressed)
            worldY += speed;
        else if (keyHandler.leftPressed)
            worldX -= speed;
        else if (keyHandler.rightPressed)
            worldX += speed;
    }
    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(Color.magenta);
        graphics2D.fillRect(screenX, screenY, gamePanel.tileSize, gamePanel.tileSize);
    }
}
