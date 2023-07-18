package Tile;

import org.apache.poi.ss.formula.functions.T;
import org.example.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class TileManager {
    GamePanel gamePanel;
    Tile[] tile;
    public TileManager(GamePanel gamePanel){
        this.gamePanel = gamePanel;
        tile = new Tile[10];
        getTileImage();
    }


    public void getTileImage(){
        tile[0] = new Tile();
        tile[1] = new Tile();
    try {
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/image/tile.png"));
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/image/image2.png"));

        }catch (IOException e){
            e.printStackTrace();
        }


    }
    public void draw(Graphics2D graphics2D){
        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;
        int n = 0;
        while (col < gamePanel.maxScreenCol && row < gamePanel.maxScreenRow){
            if( col % 2 == 0){
                graphics2D.drawImage(tile[0].image, x, y, gamePanel.tileSize, gamePanel.tileSize, null);
                col++;
            }
            else
            {
                graphics2D.drawImage(tile[1].image, x, y, gamePanel.tileSize, gamePanel.tileSize, null);
                col++;
            }
            x += gamePanel.tileSize;
            if (col == gamePanel.maxScreenCol){
                col = 0;
                x = 0;
                row++;
                y +=gamePanel.tileSize;
            }

        }
    }
}
