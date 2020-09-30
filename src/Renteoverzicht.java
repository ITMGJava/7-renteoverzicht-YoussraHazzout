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
            System.out.println("Let op! Het bedrag moet tussen de €100 en €1000 liggen.");
            float startBedrag = s.nextInt();
if (startBedrag < 100){
    System.out.println("Helaas, "+naam+", het minimale bedrag om de spaarrente te berekenen is €100, probeer het nogmaals.");
}else{if(startBedrag > 1000){
    System.out.println("Helaas,"+naam+", het maximale bedrag om de spaarrente te berekenen is €1000, probeer het nogmaals.");
}}
            for (double i = 1; i <= 10; i++) {

                if (startBedrag >= 100 && startBedrag <= 299 ) {
                    System.out.println("Met een rente van 3% per jaar is het bedrag:");
                    var spaarRente = (float) (startBedrag * i * 3) / 100 + startBedrag;
                    System.out.println("Jaar " + i + ": €" + spaarRente);
                } else {
                    if (startBedrag >= 300 && startBedrag <=599) {
                        System.out.println("Met een rente van 2% per jaar is het bedrag:");
                        var spaarRente = (float) (startBedrag * i * 2) / 100 + startBedrag;
                        System.out.println("Jaar " + i + ": €" + spaarRente);

                    }else {
                        if (startBedrag >= 599 && startBedrag <=1000) {
                            System.out.println("Met een rente van 1% per jaar is het bedrag:");
                            var spaarRente = (float) (startBedrag * i * 1) / 100 + startBedrag;
                            System.out.println("Jaar " + i + ":  €" + spaarRente);
                        }
                    }
                }

            }
        }
    }
}