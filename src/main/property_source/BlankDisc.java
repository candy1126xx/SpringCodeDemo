package main.property_source;

public class BlankDisc {

    private String title;

    public BlankDisc(String title){
        this.title = title;
    }

    public void play(){
        System.out.println(title+"is playing");
    }
}
