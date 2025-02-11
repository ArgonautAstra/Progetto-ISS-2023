package it.unipa.iss.rpg.screen.model.entitities;

public class Npc {
    private NPCSprite npcSprite;
    private String path, dialog, choose_one, choose_two;

    public Npc(NPCSprite npcSprite, String dialog, String choose_one, String choose_two) {
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

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Npc npc = (Npc) obj;

        return this.getNpcSprite().getSpritesPath().equals(npc.getNpcSprite().getSpritesPath()) && this.getDialog().equals(npc.getDialog()) &&
                this.getNpcSprite().getWorldX() == npc.getNpcSprite().getWorldX() && this.getNpcSprite().getWorldY() == npc.getNpcSprite().getWorldY() &&
                this.getChoose_one().equals(npc.getChoose_one()) && this.getChoose_two().equals(npc.getChoose_two());
    }
}
