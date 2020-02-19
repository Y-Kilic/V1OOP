package Practicum_4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
    this.adres = adr;
    this.bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon p1) {
        this.huisbaas = p1;
    }

    public String getHuisbaas() {
        return this.huisbaas.toString();
    }

    @Override
    public String toString() {
        return "Huis " + this.adres + " is gebouwd in " + this.bouwjaar + " en heeft huisbaas " + this.huisbaas;
    }
}
