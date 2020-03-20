package Practicum_8;

import java.time.LocalDate;
import java.util.Objects;

public class Computer implements IGoed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
    this.type = tp;
    this.macAdres = adr;
    this.aanschafPrijs = pr;
    this.productieJaar = jr;
    }

    public double huidigeWaarde() {
        var waarde = this.aanschafPrijs * Math.pow(0.4, LocalDate.now().getYear() - productieJaar);
        if (waarde < 0){return 0.00;}
        else {return waarde;}
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return Double.compare(computer.aanschafPrijs, aanschafPrijs) == 0 &&
                productieJaar == computer.productieJaar &&
                Objects.equals(type, computer.type) &&
                Objects.equals(macAdres, computer.macAdres);
    }

    @Override
    public String toString() {
        return "Computer: " + this.type+ " met productiejaar " + this.productieJaar + " heeft een waarde van: €" + String.format("%.2f",this.huidigeWaarde()) +".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, macAdres, aanschafPrijs, productieJaar);
    }
}
