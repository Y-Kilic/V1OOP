package OO_Analysis_Design.Opdracht_3_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

public class Land {

    private String naam;
    private String code;
    private static ArrayList<Land> alleLanden = new ArrayList<Land>();
    private HashSet<Luchthaven> luchthavens;

    public static TreeMap<String, Land> geefAlleLanden() {
        TreeMap<String, Land> result = new TreeMap<String, Land>();

        for (Land land : alleLanden) {
            result.put(land.geefNaam(), land);
        }
        return result;
    }

    public String geefNaam() { return this.naam; }

    public String geefCode() { return this.code; }
}