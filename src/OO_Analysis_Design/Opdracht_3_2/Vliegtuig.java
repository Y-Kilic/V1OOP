package OO_Analysis_Design.Opdracht_3_2;

import java.util.Calendar;

public class Vliegtuig {
    private String naam;
    private Calendar datumInGebruik;

    public Vliegtuig(String naam, Calendar datumInGebruik){
        this.naam = naam;
        this.datumInGebruik = datumInGebruik;
    }

    private void zetVliegtuigType(VliegtuigType vliegtuigType){
    }

    private Calendar geefDatumInGebruik(){
        return datumInGebruik;
    }
    public void bewaar(){

    }


}
