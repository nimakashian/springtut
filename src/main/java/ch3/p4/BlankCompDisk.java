package ch3.p4;

import ch2.p1.CompactDisk;

import java.util.List;

public class BlankCompDisk implements CompactDisk {

    private String title;
    private String artist;


    public BlankCompDisk(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String play() {
        System.out.println("cd: "+artist+"-->"+title);
        return "cd: "+artist+"-->"+title;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
