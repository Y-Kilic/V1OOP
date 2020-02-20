package Practicum_4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {

    }

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return this.aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public String getGehuurdeAuto() {
        return this.gehuurdeAuto.getType() + " met prijs per dag: " + this.gehuurdeAuto.getPrijsPerDag();
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return this.huurder;
    }

    public double totaalPrijs(){
        double standaardPrijsPerDag = this.gehuurdeAuto.getPrijsPerDag();
        var aantalDagen = this.getAantalDagen();
        var kortingKlant = (this.huurder != null) ? this.huurder.getKorting() : 0;

        var prijsZonderKorting = standaardPrijsPerDag * aantalDagen;

        var bedragKorting = prijsZonderKorting / 100 * kortingKlant;
        var TotaalMinusKorting = prijsZonderKorting - bedragKorting;

        return TotaalMinusKorting;
    }

    @Override
    public String toString() {
        var auto = (this.gehuurdeAuto != null) ? this.gehuurdeAuto : "er is geen auto bekend";
        var huurder = (this.huurder != null) ? this.huurder : "er is geen huurder bekend";
        var dagen = "aantal dagen: " + this.aantalDagen;
        var totaal = (this.gehuurdeAuto != null) ?  " en dat kost " + this.totaalPrijs() : " en dat kost 0.0";

        return auto.toString()
                + System.lineSeparator()
                + huurder.toString()
                + System.lineSeparator()
                + dagen.toString() + totaal.toString();
    }
}
