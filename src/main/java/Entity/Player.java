package Entity;

import java.awt.*;

import Entity.Entity;
import org.example.GamePanel;
import org.example.KeyHandler;

public class Player extends Entity {
    GamePanel gamePanel;
    KeyHandler keyHandler;
    //public final int screenX;
    //public final int screenY;
    public Player(GamePanel gamePanel, KeyHandler keyHandler){
        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;
        //screenX = gamePanel.screenWidth / 2 - (gamePanel.tileSize /2);
        //screenY = gamePanel.screenHeight / 2 - (gamePanel.tileSize /2);
        setDefaultValues();
    }
    public void setDefaultValues(){
        x = 400;
        y = 400;
        speed = 3;
    }
    public void update(){
        if (keyHandler.upPressed)
            y -= speed;
        else if (keyHandler.downPressed)
            y += speed;
        else if (keyHandler.leftPressed)
            x -= speed;
        else if (keyHandler.rightPressed)
            x += speed;
    }
    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(Color.magenta);
        graphics2D.fillRect(x, y, gamePanel.tileSize, gamePanel.tileSize);
    }
}
