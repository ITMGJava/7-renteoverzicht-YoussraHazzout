import java.util.Scanner;

public class Renteoverzicht {
    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        System.out.println("Hallo, wat is uw naam?");
        var naam = s.nextLine();
        System.out.println(naam + ", leuk u te ontmoeten! :-)");
        for (; ; ) {
            System.out.println(naam + ", voer een start bedrag in om de rente per jaar te berekenen.");
            float startBedrag = s.nextInt();

            for (double i = 1; i <= 10; i++) {
                if (startBedrag <= 299) {
                    System.out.println("Met een rente van 3% per jaar is het bedrag:");
                    var spaarRente = (float) (startBedrag * i * 3) / 100 + startBedrag;
                    System.out.println("Jaar " + i + ": €" + spaarRente);
                } else {
                    if (startBedrag <= 599) {
                        System.out.println("Met een rente van 2% per jaar is het bedrag:");
                        var spaarRente = (float) (startBedrag * i * 2) / 100 + startBedrag;
                        System.out.println("Jaar " + i + ": €" + spaarRente);

                    }
                }
                if (startBedrag > 599) {
                    System.out.println("Met een rente van 1% per jaar is het bedrag:");
                    var spaarRente = (float) (startBedrag * i * 1) / 100 + startBedrag;
                    System.out.println("Jaar " + i + ":  €" + spaarRente);
                }

            }
        }
    }
}