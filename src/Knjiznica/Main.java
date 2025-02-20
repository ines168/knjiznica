package Knjiznica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Knjiga> knjige = new ArrayList<>();
        knjige.add(new Knjiga("Pepeljuga", false));
        knjige.add(new Knjiga("Trnoružica", false));
        knjige.add(new Knjiga("Pocahontas", false));
        knjige.add(new Knjiga("Snjeguljica", false));
        knjige.add(new Knjiga("Ariel", false));

        knjige.get(0).posudiKnjigu();
        knjige.get(4).posudiKnjigu();
        knjige.get(0).posudiKnjigu();
        knjige.get(0).vratiKnjigu();

        System.out.println();

        Collections.sort(knjige);
        for (Knjiga knjiga : knjige) {
            System.out.println(knjiga);
        }
    }
}
