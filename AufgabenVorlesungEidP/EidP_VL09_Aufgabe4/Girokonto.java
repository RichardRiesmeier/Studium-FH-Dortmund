package EidP_VL09_Aufgabe4;

public class Girokonto {
    //Attribute
    private String kontonummer;
    private double kontostand;
    private double dispokredit;
    private static int anzahlKonten;
    private static final int BASISNUMMER = 822000000;

    //Konstruktor
    public Girokonto() {
        this.kontonummer = "0" + (822000000 + anzahlKonten);
    }

    //Methoden
    public String getKontonummer() {
        return this.kontonummer;
    }
    public double getKontostand() {
        return this.kontostand;
    }
    public double getDispokredit() {
        return this.dispokredit;
    }

    public void setDispokredit(double kredit) {
        this.dispokredit = kredit;
    }
    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    public boolean auszahlen(double betrag) {
        if(kontostand+dispokredit>=betrag) {
            this.kontostand -= betrag;
            return true;
        } else {
            return false;
        }
    }

    public boolean ueberweisung(Girokonto zweitesKonto, double betrag) {
        if(this.auszahlen(betrag)) {
            zweitesKonto.einzahlen(betrag);
            return this.auszahlen(betrag);
        } else {
            return false;
        }
    }

    public String toString() {
        return "Kontonummer: "+ this.kontonummer +
                ", Kontostand:" + this.kontostand +
                ", Dispokredit: " + this.dispokredit;
    }
    public static int getAnzahlKonten() {
        return anzahlKonten;
    }
}
