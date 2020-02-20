package Practicum_3A;

import Practicum_2B.Voetbalclub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    /* Eis: als de clubnaam null of leeg ("") is, moet de naam "FC" gebruikt worden. */
    @Test
    public void TestclubnaamNullOfLeeg() {

        Voetbalclub club = new Voetbalclub("");
        assertEquals("FC", club.getNaam());
    }

    /* Eis: het verwerken van de resultaten ‘w’, ‘g’ en ‘v’ levert respectievelijk 3, 1 en 0 punten op.
     Foutieve invoer mag het puntensaldo en totaalaantal gespeelde wedstrijden niet beïnvloeden! */
    @Test
    public void TestPuntensaldo() {

        Voetbalclub club = new Voetbalclub("testClub");
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('v');

        club.verwerkResultaat('p');
        club.verwerkResultaat('f');
        club.verwerkResultaat('f');

        assertEquals("testClub 3 1 1 1 4", club.toString());
    }

    /* Eis: het verwerken van de resultaten ‘w’, ‘g’ en ‘v’ levert respectievelijk 3, 1 en 0 punten op,
 en is zichtbaar in de stringrepresentatie van de toString-methode. */
    @Test
    public void TestStringPresentatie() {

        Voetbalclub club = new Voetbalclub("testClub");
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');

        assertEquals("testClub 2 1 1 0 4", club.toString());

        club.verwerkResultaat('v');

        assertEquals("testClub 3 1 1 1 4", club.toString());

    }

    /* Eis: herhaaldelijk verwerken van deze resultaten moet zorgen voor een correcte optelling van wedstrijdaantallen
    en punten.
*/
    @Test
    public void TestHerhaaldelijkVerwerken() {

    Voetbalclub club = new Voetbalclub("testClub");
    club.verwerkResultaat('w');
    club.verwerkResultaat('g');
    club.verwerkResultaat('v');

    assertEquals("testClub 3 1 1 1 4", club.toString());

    club.verwerkResultaat('w');
    club.verwerkResultaat('g');
    club.verwerkResultaat('v');

    assertEquals("testClub 6 2 2 2 8", club.toString());
}

}
