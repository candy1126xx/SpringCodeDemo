package main.spring_aop;

public class Performer implements Performance{
    @Override
    public void perform() {
        System.out.println("singing and dancing");
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("Bean trackNumber：" + trackNumber);
    }
}
