package EidP_VL09_Aufgabe4;

public class GirokontoTest {
    public static void main(String[] args)
    {
        Girokonto erstesKonto = new Girokonto();
        Girokonto zweitesKonto = new Girokonto();
        Girokonto drittesKonto = new Girokonto();
        System.out.println(erstesKonto);
        System.out.println(zweitesKonto);
        System.out.println(drittesKonto);
        System.out.println("Anzahl Konten: " +
                Girokonto.getAnzahlKonten());
        erstesKonto.einzahlen(100.0);
        System.out.println(erstesKonto);
        System.out.println("Auszahlen erfolgreich: " +
                erstesKonto.auszahlen(250.0));
        System.out.println(erstesKonto);
        System.out.println();
        zweitesKonto.setDispokredit(1000.0);
        System.out.println(zweitesKonto);
        System.out.println("Auszahlen erfolgreich: " +
                zweitesKonto.auszahlen(250.0));
        System.out.println(zweitesKonto);
        System.out.println();
        System.out.println("Überweisung erfolgreich: " +
                erstesKonto.ueberweisung(zweitesKonto, 150.0));
        System.out.println(erstesKonto);
        System.out.println(zweitesKonto);
        System.out.println();
        System.out.println("Überweisung erfolgreich: " +
                zweitesKonto.ueberweisung(drittesKonto, 750.0));
        System.out.println(zweitesKonto);
        System.out.println(drittesKonto);
    }
}
