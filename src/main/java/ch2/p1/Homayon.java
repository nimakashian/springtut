package ch2.p1;

import org.springframework.stereotype.Component;

@Component
public class Homayon implements CompactDisk {

    String title="mast o mastor";
    String artist="Homayon";

    public String play() {
        System.out.println("cd: "+artist+"-->"+title);
        return "cd: "+artist+"-->"+title;
    }
}
