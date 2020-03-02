package Practicum_5;

public class Leerling {
    private String _naam;
    private double _cijfer;

    public Leerling(String naam) {
        this._naam = naam;
    }

    public String getNaam() {
        return this._naam;
    }

    public void setCijfer(double cijfer){
        this._cijfer = cijfer;
    }

    public double getCijfer() {
        return this._cijfer;
    }
}
