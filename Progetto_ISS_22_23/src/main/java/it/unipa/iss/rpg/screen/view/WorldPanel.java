package it.unipa.iss.rpg.screen.view;

import it.unipa.iss.rpg.screen.controller.WorldController;

import javax.swing.*;
import java.awt.*;

public class WorldPanel extends GamePanel {
    private WorldController controller;

    public WorldPanel(){
        super();
        setPanel();
    }

    public void setPanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.darkGray);
        this.setDoubleBuffered(true);
        //panel.addKeyListener(handler);
        this.setFocusable(true);
    }

    public JPanel getPanel(){
        return this;
    }

    public int scaleTile() {
        return tileSize * scale;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(controller != null) {
            Graphics2D g2 = (Graphics2D) g;
            controller.drawWorld(g2);
            controller.drawEnemies(g2);
            controller.drawCharacters(g2);
            controller.drawPlayer(g2);
            g2.dispose();
        }
    }
    public void addController(WorldController controller) {
        this.controller = controller;
    }
}
