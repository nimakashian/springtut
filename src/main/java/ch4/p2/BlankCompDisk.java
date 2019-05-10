package ch4.p2;



import java.util.List;

public class BlankCompDisk implements CompactDisk  {

    private String title;
    private String artist;
    private List<String> songs;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public BlankCompDisk() {
    }

    @Override
    public String play() {
        System.out.println("cd: "+artist+"-->"+title);
        for (String s: songs ) {
            playTrack(s);
//            System.out.println(" sdfsdfsf");
        }
        return "cd: "+artist+"-->"+title;
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("song:"+trackNumber+"-->"+songs.get(trackNumber));
    }

    @Override
    public void playTrack(String trackNumber) {
        System.out.println("song:"+trackNumber);
    }

}