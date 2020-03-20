package Practicum_8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr) {
        super(tp, pr, jr);
    }

    @Override
    public double huidigeWaarde() {
        return this.nieuwprijs * Math.pow(0.1, LocalDate.now().getYear() - this.bouwjaar);
    }
}
