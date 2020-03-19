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
        if (!gameArrayList.contains(g)) {
            if (this.budget >= g.huidigeWaarde()) {
                this.budget -= g.huidigeWaarde();

                gameArrayList.add(g);
                return true;
            }
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (koper.getBudget() >= g.huidigeWaarde() && !koper.gameArrayList.contains(g) && this.gameArrayList.contains(g)) {
            this.gameArrayList.remove(g);
            koper.gameArrayList.add(g);
            this.budget += g.huidigeWaarde();
            koper.budget -= g.huidigeWaarde();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String budgetTweeCommas = String.format("%.2f", this.budget);

        String result = this.naam + " heeft een budget van €" + budgetTweeCommas + " en bezit de volgende games:";

        for (Game game : gameArrayList) {
            String tempNaam = System.lineSeparator() + game.toString();
            result += tempNaam;
        }

        return result;

    }

    public Game zoekGameOpNaam(String spel) {
        for (Game game : gameArrayList) {
            if(game.getNaam().equals(spel)){
                return game;
            }
        }
        return null;

    }
}
