package ch1.p1;

public class Library {
    private Print print;

    public Library(Print print){
        this.print=print;
    }

    public void find(){
        print.isOnShelf();
    }
    public void request(){
        print.borrow();
    }
}
