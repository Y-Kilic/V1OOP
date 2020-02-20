package Practicum_4B;

import org.junit.jupiter.api.Test;

import java.net.Authenticator;

import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {

    @Test
    public void testHuurderZonderKorting(){
        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);

        Klant k = new Klant("Mijnheer de Vries");
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);

    assertEquals("autotype: Ferrari met prijs per dag: 3500.0"
            + System.lineSeparator()
            + "op naam van: Mijnheer de Vries (korting: 0.0%)"
            + System.lineSeparator()
            + "aantal dagen: 1 en dat kost 3500.0", ah2.toString());
    }

    @Test
    public void testHuurderMetKorting(){
        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);

        assertEquals("autotype: Ferrari met prijs per dag: 3500.0"
                + System.lineSeparator()
                + "op naam van: Mijnheer de Vries (korting: 10.0%)"
                + System.lineSeparator()
                + "aantal dagen: 1 en dat kost 3150.0"
                , ah2.toString());
    }

    @Test
    public void TestGeenHuurderGeenAuto(){
        AutoHuur ah2 = new AutoHuur();
        assertEquals("er is geen auto bekend"
                + System.lineSeparator()
                + "er is geen huurder bekend"
                + System.lineSeparator()
                + "aantal dagen: 0 en dat kost 0.0"
                , ah2.toString());
    }

    @Test
    public void TestGeenHuurderWelAuto(){
        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);

        assertEquals("autotype: Ferrari met prijs per dag: 3500.0"
                        + System.lineSeparator()
                        + "er is geen huurder bekend"
                        + System.lineSeparator()
                        + "aantal dagen: 0 en dat kost 0.0"
                , ah2.toString());
    }

    @Test
    public void TestWelHuurderGeenAuto(){
        AutoHuur ah2 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        ah2.setHuurder(k);

        assertEquals("er is geen auto bekend"
                        + System.lineSeparator()
                        + "op naam van: Mijnheer de Vries (korting: 0.0%)"
                        + System.lineSeparator()
                        + "aantal dagen: 0 en dat kost 0.0"
                , ah2.toString());
    }

    @Test
    public void TestTotaalPrijs(){
        AutoHuur ah2 = new AutoHuur();
        assertEquals(0.0, ah2.totaalPrijs());

        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah2.setHuurder(k);

        ah2.setAantalDagen(1);
        assertEquals(3150.0, ah2.totaalPrijs());
    }

}