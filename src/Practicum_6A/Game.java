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

    public double huidigeWaarde(){
        int jaarNu = LocalDate.now().getYear() ; // 1 jaar geleden
        int jaarVerschil = jaarNu - releaseJaar;

        if (jaarVerschil == 0){ return nieuwprijs;}
        else{
            var prijsZonderKorting = nieuwprijs;

            int kortingBedrag = 30 * jaarVerschil;

            var bedragKorting = prijsZonderKorting / 100 * kortingBedrag;

            return nieuwprijs - bedragKorting;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return releaseJaar == game.releaseJaar &&
                Double.compare(game.nieuwprijs, nieuwprijs) == 0 &&
                naam.equals(game.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, releaseJaar, nieuwprijs);
    }

    @Override
    public String toString() {
        double huidigeWaardeDecimal2 = Math.round(this.huidigeWaarde() * 100.0) / 100.0;
        return this.naam + ", uitgegeven in " + this.releaseJaar + "; nieuwprijs: €" + this.nieuwprijs + " nu voor: " + huidigeWaardeDecimal2;
    }
}
