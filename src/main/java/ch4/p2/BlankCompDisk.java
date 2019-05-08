package ch4.p2;

import ch2.p1.CompactDisk;

import java.util.List;

public class BlankCompDisk implements CompactDisk {

    private String title;
    private String artist;
    private List<String> songs;

    public BlankCompDisk(String title, String artist, List<String> songs) {
        this.title = title;
        this.artist = artist;
        this.songs=songs;

    }

    public String play() {
        System.out.println("cd: "+artist+"-->"+title);
        for (String s: songs ) {
            playTrack(s);
        }
        return "cd: "+artist+"-->"+title;
    }

    public void playTrack(int track){
        System.out.println("song:"+track);
    }
    public void playTrack(String track){
        System.out.println("song:"+track);
    }
}