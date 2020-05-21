package main.xmlconfig;

public class MusicPlayer {

    private Music music;
    private String endTime;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void play() {
        music.play();
        System.out.println("endTime " + endTime);
    }
}
