package Practicum_5;

import java.util.*;

public class Klas {
    private String _naam;
    private ArrayList<Leerling> leerlingList = new ArrayList<>();

    public Klas(String naam) {
        _naam = naam;
    }

    public void voegLeerlingToe(Leerling leerling) {
        leerlingList.add(leerling);
    }

    public void wijzigCijfer(String naam, double cijfer) {
        for (Leerling leerling : leerlingList) {

            if (leerling.getNaam().equals(naam)){
                leerling.setCijfer(cijfer);
                return;
            }
        }
    }

    public int aantalLeerlingen() {
        return leerlingList.size();
    }

    @Override
    public String toString() {
        String result = "In klas " + this._naam +" zitten de volgende leerlingen:";

        for (Leerling leerling : leerlingList) {
            result += System.lineSeparator() + leerling.getNaam() + " heeft cijfer: " + leerling.getCijfer();
        }

        /* Zodat het hetzelfde uitziet als op canvas...*/
        result += System.lineSeparator();

        return result;
    }
}
