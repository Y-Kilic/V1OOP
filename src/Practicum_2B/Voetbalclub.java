package Practicum_2B;

public class Voetbalclub {
    private int aantalGewonnen = 0;
    private int aantalVerloren = 0;
    private int aantalGelijk = 0;
    private String naam;

    public Voetbalclub(String naam) {
        if (naam == "") {
            this.naam = "FC";
        }
        else {
            this.naam = naam;
        }
    }

    public String getNaam() {
        return naam;
    }

    public int aantalGespeeld() {
        return this.aantalGewonnen + this.aantalVerloren + this.aantalGelijk;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public int aantalPunten() {
    var aantalPuntenWinst = this.aantalGewonnen * 3;
    var aantalPuntenGelijk = this.aantalGelijk * 1;

    return aantalPuntenWinst + aantalPuntenGelijk;
    }

    public String toString() {
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + 0 + " " + aantalPunten();
    }
}