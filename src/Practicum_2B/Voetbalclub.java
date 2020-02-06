package Practicum_2B;

public class Voetbalclub {
    int aantalGewonnen = 0;
    int aantalVerloren = 0;
    int aantalGelijk = 0;
    String naam;

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
}
