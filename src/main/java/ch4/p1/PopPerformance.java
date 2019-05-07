package ch4.p1;

import org.springframework.stereotype.Component;

@Component
public class PopPerformance implements Performance {
    public void perform() {
        System.out.println("hoooooooooooooooooorraaaaay");
    }
}
