package it.unipa.iss.rpg.screen.model.entitities;

import it.unipa.iss.rpg.combat.model.Statistics;

public class NPC implements Entity{
    private NPCSprite npcSprite;
    private String path, dialog, choose_one, choose_two;

    public NPC(NPCSprite npcSprite, String dialog, String choose_one, String choose_two) {
        this.path = path;
        this.npcSprite = npcSprite;
        this.dialog = dialog;
        this.choose_one = choose_one;
        this.choose_two = choose_two;
    }

    public NPCSprite getNpcSprite() {
        return npcSprite;
    }

    public String getPath() {
        return path;
    }

    public String getDialog() {
        return dialog;
    }

    public String getChoose_one() {
        return choose_one;
    }

    public String getChoose_two() {
        return choose_two;
    }
}