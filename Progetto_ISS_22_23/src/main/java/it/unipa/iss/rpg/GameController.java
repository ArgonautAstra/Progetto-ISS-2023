package it.unipa.iss.rpg;

import it.unipa.iss.rpg.screen.model.*;
import it.unipa.iss.rpg.screen.model.entitities.Player;
import it.unipa.iss.rpg.screen.view.DialogPanel;
import it.unipa.iss.rpg.screen.view.GamePanel;

public abstract class GameController {
    private Player player;
    private GamePanel gamePanel;
    private boolean active;

    public abstract void update(EventType e);
    public abstract void runController();

    public GameController() {

    }

    public GameController(Player player, GamePanel gamePanel) {
        this.player = player;
        this.gamePanel = gamePanel;
        this.active = true;
    }

    public GamePanel getGamePanel() {
        return this.gamePanel;
    }

    public Player getPlayer() {
        return this.player;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

