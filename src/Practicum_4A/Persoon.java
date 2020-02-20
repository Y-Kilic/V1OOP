package Practicum_4A;

public class Persoon {
    private String naam;
    private int leefdtijd;

    public Persoon(String nm, int lft) {
        this.naam = nm;
        this.leefdtijd = lft;
    }

    @Override
    public String toString() {
        return this.naam + "; " + "leefdtijd " + this.leefdtijd + " jaar";
    }
}
