package Practicum_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarisTest {

    // telkens maar één van de twee dezelfde objecten is aangeschaft.
    @Test
    public void tweeDezelfdeObjectenTest(){
        // Maak een BedrijfsInventaris-object aan met voldoende budget.
        var bedrijfsInventaris = new BedrijfsInventaris("Kilic Bv", 1000000.00);

        // Maak 2 Computer-objecten aan, die exact dezelfde eigenschappen hebben.
        var hpX1 = new Computer("HP", "345435435", 50000.00,2015);
        var hpX2 = new Computer("HP", "345435435", 50000.00,2015);


        bedrijfsInventaris.schafAan(hpX1);
        bedrijfsInventaris.schafAan(hpX2);

        assertEquals("Computer: HP met productiejaar 2015 heeft een waarde van: €512,00.".trim(),bedrijfsInventaris.toString().trim());
    }

    // het aanschaffen mislukt als er onvoldoende budget is.
    @Test
    public void onvoldoendeBalans(){
        // Maak een BedrijfsInventaris-object aan met voldoende budget.
        var bedrijfsInventaris = new BedrijfsInventaris("Kilic Bv", 10.00);

        // Maak 2 Computer-objecten aan, die exact dezelfde eigenschappen hebben.
        var hpX1 = new Computer("HP", "345435435", 50000.00,2015);

        bedrijfsInventaris.schafAan(hpX1);

        assertEquals("", bedrijfsInventaris.toString().trim());
    }

    // het berekenen van de huidige waarde correct gebeurt.
    @Test
    public void huidigeWaardeCorrect(){
        // Maak een BedrijfsInventaris-object aan met voldoende budget.
        var bedrijfsInventaris = new BedrijfsInventaris("Kilic Bv", 1000000.00);

        // Maak 2 Computer-objecten aan, die exact dezelfde eigenschappen hebben.
        var hpX1 = new Computer("HP", "345435435", 50000.00,2015);
        var hpX2 = new Computer("HP", "345435435", 25000.00,2015);

        bedrijfsInventaris.schafAan(hpX1);
        bedrijfsInventaris.schafAan(hpX2);

        assertEquals("Computer: HP met productiejaar 2015 heeft een waarde van: €512,00.\nComputer: HP met productiejaar 2015 heeft een waarde van: €256,00.".trim(),bedrijfsInventaris.toString().trim());
    }
}
