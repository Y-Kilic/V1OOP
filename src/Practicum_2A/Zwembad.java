package Practicum_2A;

public class Zwembad {
    double breedte = 0;
    double lengte = 0;
    double diepte = 0;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public Zwembad() {
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }
    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }
    public double inhoud() {
        return this.lengte * this.breedte * this.diepte;
    }

    @Override
        public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte +" meter lang, en " + diepte + " meter diep";
    }
}
