package it.unipa.iss.rpg.screen.view;

import javax.swing.*;
import java.awt.*;

public abstract class GamePanel extends JPanel {
    protected Graphics graphics;
    protected int screenHeight;
    protected int screenWidth;
    protected int maxRow, maxCol;
    protected int scale, tileSize;
    //WorldHandler handler = new WorldHandler();

    public GamePanel(){
        scale = 3;
        maxRow = 6;
        maxCol = 8;
        tileSize = 32;
        screenHeight = scaleTile() * maxRow;
        screenWidth = scaleTile() * maxCol;
    }

    public abstract void setPanel();

    public abstract int scaleTile();

    public int getMaxRow() {
        return maxRow;
    }

    public int getMaxCol() {
        return maxCol;
    }

}
