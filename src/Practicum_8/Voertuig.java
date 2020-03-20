package Practicum_8;

import Practicum_9A.Utils;

import java.util.Objects;

public abstract class Voertuig implements IGoed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
    this.type = tp;
    this.nieuwprijs = pr;
    this.bouwjaar = jr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Double.compare(voertuig.nieuwprijs, nieuwprijs) == 0 &&
                bouwjaar == voertuig.bouwjaar &&
                Objects.equals(type, voertuig.type);
    }

    @Override
    public String toString() {
        return "Voertuig: "+ this.type +" met bouwjaar " + this.bouwjaar + " heeft een waarde van: €" + Utils.euroBedrag(this.huidigeWaarde()) + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, nieuwprijs, bouwjaar);
    }
}
