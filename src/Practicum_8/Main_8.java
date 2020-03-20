package Practicum_8;

public class Main_8 {
    public static void main(String[] args) {
        // Maak een BedrijfsInventaris-object aan met voldoende budget.
        var bedrijfsInventaris = new BedrijfsInventaris("Kilic Bv", 1000000.00);

        // Maak 2 Computer-objecten aan, die exact dezelfde eigenschappen hebben.
        var hpX1 = new Computer("HP", "345435435", 50000.00,2015);
        var hpX2 = new Computer("HP", "345435435", 50000.00,2015);

        // Doe dit ook voor Fiets en Auto.
        var fietsX1 = new Fiets("Ferrari", 200000.00, 2016);
        var fietsX2 = new Fiets("Ferrari", 200000.00, 2016);

        var lamboX1 = new Auto("Lamborghini",500000.000,2017);
        var lamboX2 = new Auto("Lamborghini",500000.000,2017);

        // Maak ook nog een auto, fiets en computer met andere eigenschappen.
        var peugotV1 = new Auto("Peugot", 600000.00, 2018);
        var fietsV1 = new Fiets("Lokka", 100000.00, 2019);
        var compV1 = new Computer("Dell", "7684435", 2000000.00,2015);

        // Probeer alle objecten aan de bedrijfsinventaris toe te voegen.
        bedrijfsInventaris.schafAan(hpX1);
        bedrijfsInventaris.schafAan(hpX2);
        bedrijfsInventaris.schafAan(fietsX1);
        bedrijfsInventaris.schafAan(fietsX2);
        bedrijfsInventaris.schafAan(lamboX1);
        bedrijfsInventaris.schafAan(lamboX2);
        bedrijfsInventaris.schafAan(peugotV1);
        bedrijfsInventaris.schafAan(fietsV1);
        bedrijfsInventaris.schafAan(compV1);

        // Print de BedrijfsInventaris
        System.out.println(bedrijfsInventaris);





    }
}
