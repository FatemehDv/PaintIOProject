package Tile;

import org.example.GamePanel;

import java.awt.*;
import java.io.IOException;

public class TileManager {
    GamePanel gamePanel;
    Tile[] tile;
    int mapTileNum[][];
    public TileManager(GamePanel gamePanel){
        this.gamePanel = gamePanel;
        tile = new Tile[10];
        mapTileNum = new int[gamePanel.maxWorldCol][gamePanel.maxWorldRow];
    }
    public void getTileImage(){
        try {

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void draw(Graphics2D graphics2D){

    }
}
