package Practicum_7;

public class VervangProces implements IOpmaakProces {
    private String oud;
    private String nieuw;

    public VervangProces(String oud, String nieuw) {
        this.oud = oud;
        this.nieuw = nieuw;
    }
    public String maakOp(String input)
    {
        return input.replace(oud, nieuw);
    }
}
