package Practicum_8;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr) {
        super(tp, pr, jr);
    }

    @Override
    public double huidigeWaarde() {
        var waarde = this.nieuwprijs * Math.pow(0.3, LocalDate.now().getYear() - this.bouwjaar);
        if (waarde < 0){return 0.00;}
        else {return waarde;}
    }
}
