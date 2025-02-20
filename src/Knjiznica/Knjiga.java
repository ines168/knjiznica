package Knjiznica;

public class Knjiga implements PosudbaKnjige, Comparable<Knjiga>{
    String naslov;
    boolean jePosudena;

    public Knjiga(String naslov, boolean jePosudena) {
        this.naslov = naslov;
        this.jePosudena = jePosudena;
    }

    @Override
    public void posudiKnjigu() {
        if (!jePosudena) {
            System.out.println("Posuđuješ " + naslov + "!");
            jePosudena = true;
        } else {
            System.out.println(naslov + " je već posuđena! Pokušaj s drugim naslovom!");
        }

    }

    @Override
    public void vratiKnjigu() {
        if (jePosudena) {
            System.out.println("Vraćaš " + naslov + "!");
            jePosudena = false;
        } else {
            System.out.println(naslov + " je već u knjižnici! Provjeri svoj naslov!");
        }

    }

    @Override
    public String toString() {
        return naslov + (jePosudena? " je " : " nije ") + "posuđena.";
    }

    @Override
    public int compareTo(Knjiga o) {
        return this.naslov.compareTo(o.naslov);
    }
}
