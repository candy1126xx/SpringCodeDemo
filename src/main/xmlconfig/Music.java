package main.xmlconfig;

import java.util.List;

public class Music {

    private String song;
    private List<Integer> tracks;

    public Music(String song, List<Integer> tracks) {
        this.song = song;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Music Playing " + song);
        if(tracks != null){
            for (Integer track : tracks) {
                System.out.println("track " + track);
            }
        }
    }
}
