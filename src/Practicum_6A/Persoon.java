package Practicum_6A;

import Practicum_5.Leerling;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> gameArrayList = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return this.budget;
    }

    public boolean koop(Game g) {
        for (Game game : gameArrayList) { if (game.equals(g)){return false;} }

        if(this.budget >= g.huidigeWaarde()){
            this.budget -= g.huidigeWaarde();

            gameArrayList.add(g);
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        return true;
    }

    @Override
    public String toString() {
        double budgetDecimal2 = Math.round(this.budget * 100.0) / 100.0;
        String result = "Eric heeft een budget van €" + budgetDecimal2 + " en bezit de volgende games: ";

        for (Game game : gameArrayList) {
            String tempNaam = System.lineSeparator() + game.toString();
            result += tempNaam;
        }

        return result;

    }
}
