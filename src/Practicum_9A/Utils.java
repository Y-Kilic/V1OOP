package Practicum_9A;

public class Utils {

    // Klasse Utils wordt ook uitgerust met een static attribuut
    // waarmee wordt bijgehouden hoe vaak euroBedrag-methoden worden
    // aangeroepen. Met een static getter moet deze
    // waarde opgevraagd kunnen worden.
private static int count = 0;

private static int getCount()
{ return count; }

    public static String euroBedrag(double bedrag) {
    return euroBedrag(bedrag, 2);
}

    public static String euroBedrag(double bedrag, int precisie) {
        count += 1;
        return String.format("%." + precisie + "f",bedrag);
    }

    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(100.213432));
        System.out.println(Utils.euroBedrag(155.513432));

        System.out.println(Utils.euroBedrag(155.51332, 1));
        System.out.println(Utils.euroBedrag(155.513442, 4));

        // Klasse Utils wordt ook uitgerust met een static attribuut
        // waarmee wordt bijgehouden hoe vaak euroBedrag-methoden
        // worden aangeroepen.
        // Met een static getter moet deze waarde opgevraagd kunnen worden.
        System.out.println(getCount());
    }
}
