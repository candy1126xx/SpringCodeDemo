package main.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class GamePlayer {

    private Game game;
    private NPC npc;

    public GamePlayer(Game game) {
        this.game = game;
    }

    @Autowired
    public void setNpc(NPC npc){
        this.npc = npc;
    }

    public void play() {
        System.out.println(npc.name());
        game.play();
    }
}
