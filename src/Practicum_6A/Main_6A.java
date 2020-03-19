package Practicum_6A;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main_6A {

    public static void main(String[] args) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);

        System.out.println("p1 koopt g1:" + (p1.koop(g1) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g2:" + (p1.koop(g2) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g3:" + (p1.koop(g3) ? "" : " niet") + " gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");

        System.out.println("p1 verkoopt g2 aan p2:"+(p1.verkoop(g2, p2) ? "" : " niet")+" gelukt");
        System.out.println("p1 verkoopt g1 aan p2:"+(p1.verkoop(g1, p2) ? "" : " niet")+" gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");

        Game game1 = p1.zoekGameOpNaam("Just Cause 3");
        System.out.println("p1 heeft Just Cause 3 " + (game1 != null ? "wel!" : "niet!"));

        ArrayList<Game> teKoop = new ArrayList<Game>();
        teKoop.add(g1);
        teKoop.add(new Game("Mario Kart 8", 2019, 35.00));

        ArrayList<Game> nogNietInBezit = p1.bepaalGamesNietInBezit(teKoop);
        System.out.println("p1 heeft de volgende games nog niet: " + nogNietInBezit.toString());
    }

}
