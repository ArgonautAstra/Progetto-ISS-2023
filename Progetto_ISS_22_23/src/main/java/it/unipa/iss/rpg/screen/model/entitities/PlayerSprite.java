package it.unipa.iss.rpg.screen.model.entitities;

import it.unipa.iss.rpg.screen.model.EventType;

import java.awt.image.BufferedImage;
import java.util.List;

public class PlayerSprite extends EntitySprite{
    private BufferedImage directionImage;

    public PlayerSprite() {
        super(100, 120);
    }

    public PlayerSprite(int x, int y){
        super(x, y);
    }
    @Override
    public void addSprite(BufferedImage tile) {
        super.getSprites().add(tile);
    }

    @Override
    public void setSprites(List<BufferedImage> sprites) {
        super.setSprites(sprites);
    }

    public BufferedImage getDirectionImage() {
        return this.directionImage;
    }

    public void setDirectionImage(EventType eventType) {
        if(!this.getSprites().isEmpty()) {
            switch (eventType) {
                case MOVED_DOWN -> this.directionImage = getSprites().get(0);
                case MOVED_UP -> this.directionImage = getSprites().get(1);
                case MOVED_LEFT -> this.directionImage = getSprites().get(2);
                case MOVED_RIGHT -> this.directionImage = getSprites().get(3);
            }
        }
    }
}
