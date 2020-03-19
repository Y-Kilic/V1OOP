package Practicum_6A;

import java.time.LocalDate;
import java.util.Objects;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return this.naam;
    }

    public double huidigeWaarde() {
        return this.nieuwprijs * Math.pow(0.7, LocalDate.now().getYear() - releaseJaar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return releaseJaar == game.releaseJaar &&
                naam.equals(game.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, releaseJaar, nieuwprijs);
    }

    @Override
    public String toString() {
        double huidigeWaardeDecimal2 = Math.round(this.huidigeWaarde() * 100.0) / 100.0;
        String budgetTweeCommas = String.format("%.2f",this.huidigeWaarde());
        String nieuwPrijsTweeCommas = String.format("%.2f",this.nieuwprijs);
var result = this.naam + ", uitgegeven in " + this.releaseJaar + "; nieuwprijs: €" + nieuwPrijsTweeCommas + " nu voor: €" + budgetTweeCommas;

        return result;
    }


}
