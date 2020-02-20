package OO_Analysis_Design.Opdracht_3_2;

import java.util.TreeMap;

class RegistreerLuchthaven {
    private Luchthaven luchthaven;
    private Land selectedLand;
    private TreeMap<String, Land> alleLanden = new TreeMap<String, Land>();

    public void start() {
        alleLanden = Land.geefAlleLanden();
        // toon alle landen (dropdownbox)
        luchthaven = new Luchthaven();
    }

    public void landNaam(String landNaam) { // gebruiker kiest land uit
        selectedLand = alleLanden.get(landNaam); //
        luchthaven.zetLand(selectedLand);
        // toon code van gekozen land op scherm
        selectedLand.geefCode();

    }

    public naam(String naam) {}
    public int code() {
        return this.code();
    }
    public werkplaats() {}
    public ok() {}
}