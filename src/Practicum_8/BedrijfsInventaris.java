package Practicum_8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<IGoed> alleGoederen = new ArrayList<IGoed>();

    public BedrijfsInventaris(String nm, double bud )
    {
        this.bedrijfsnaam = nm;
        this.budget = bud;
    }

    public void schafAan(IGoed g)
    {
        if(!alleGoederen.contains(g) && g.huidigeWaarde() <= budget)
        {alleGoederen.add(g);}
    }

    @Override
    public String toString() {
        var outputString = "";
        for (IGoed goed : alleGoederen) {
            outputString += goed.toString() + "\n";
        }
        return outputString;
    }
}
