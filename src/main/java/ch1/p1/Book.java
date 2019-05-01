package ch1.p1;

import java.io.PrintStream;
import java.util.Random;

public class Book implements Print {
    PrintStream ps;
    final int bookId=(new Random()).nextInt(1000);

    public Book(PrintStream ps) {
        this.ps = ps;
    }

    public void isOnShelf() {
        ps.printf("the book %s is on the shelf \n",bookId);
    }

    public void borrow() {
        ps.printf("the book %s borroed \n",bookId);
    }
}
