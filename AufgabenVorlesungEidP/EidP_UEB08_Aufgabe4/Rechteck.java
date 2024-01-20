package EidP_UEB08_Aufgabe4;

public class Rechteck {
    //attributes
    private Punkt2D linkeuntereEcke;
    private double seitenlaengeX;
    private double seitenlaengeY;

    //constructor
    Rechteck(Punkt2D linksUnten, double x, double y) {
        this.linkeuntereEcke = linksUnten;
        this.seitenlaengeX = x;
        this.seitenlaengeY = y;
    }

    //methods
    double getseitenlaengeX() {
        return this.seitenlaengeX;
    }
    double getseitenlaengeY() {
        return this.seitenlaengeY;
    }
    void setseitenlaengeX(double seitenlaengeX) {
        this.seitenlaengeX = seitenlaengeX;
    }
    void setseitenlaengeY(double seitenlaengeY) {
        this.seitenlaengeY = seitenlaengeY;
    }
    Punkt2D getEckeLinksUnten() {
        return linkeuntereEcke;
    }
    Punkt2D getEckeLinksOben() {
        return new Punkt2D(linkeuntereEcke.getX(),
                linkeuntereEcke.getY()+this.seitenlaengeY);
    }
    Punkt2D getEckeRechtsUnten() {
        return new Punkt2D(linkeuntereEcke.getX()+this.seitenlaengeX,
                linkeuntereEcke.getY());
    }
    Punkt2D getEckeRechtsOben() {
        return new Punkt2D(linkeuntereEcke.getX()+this.seitenlaengeX,
                linkeuntereEcke.getY()+this.seitenlaengeY);
    }
    public String toString() {
        return "Rechteck mit Seitelängen " + seitenlaengeX + " und " +
                seitenlaengeY + " an der Stelle (" + linkeuntereEcke.getX() +
                ", " + linkeuntereEcke.getY() +")";
    }


    private double[] Schnittkoordinaten(Rechteck R) {
    // Die Methode ermittelt die Schnittkoordinaten des möglichen
    // Schnittrechtecks und gibt die Werte in einem Double-Feld zurück

    // Linke untere und rechte obere "dieses" Rechtecks (Rechteck A)
        double lu_a_x = this.linkeuntereEcke.getX();
        double lu_a_y = this.linkeuntereEcke.getY();
        double ro_a_x = this.getEckeRechtsOben().getX();
        double ro_a_y = this.getEckeRechtsOben().getY();

        // Linke untere und rechte obere des zu schneidenden Rechtecks (B)
        double lu_b_x = R.linkeuntereEcke.getX();
        double lu_b_y = R.linkeuntereEcke.getY();
        double ro_b_x = R.getEckeRechtsOben().getX();
        double ro_b_y = R.getEckeRechtsOben().getY();

        // Was wären die linke untere und die rechte obere Ecke der Schnittmenge?
        double max_lu_x = lu_a_x < lu_b_x ? lu_b_x : lu_a_x ;
        double max_lu_y = lu_a_y < lu_b_y ? lu_b_y : lu_a_y ;
        double min_ro_x = ro_a_x < ro_b_x ? ro_a_x : ro_b_x ;
        double min_ro_y = ro_a_y < ro_b_y ? ro_a_y : ro_b_y ;
        double[] erg = {max_lu_x, max_lu_y, min_ro_x, min_ro_y};
        return erg;
    }

    public boolean schneidet (Rechteck R) {
        double[] koords = Schnittkoordinaten(R);
        double lu_x = koords[0];
        double lu_y = koords[1];
        double ro_x = koords[2];
        double ro_y = koords[3];
    // Prüfe, ob die Koordinaten der Ecken tatsächlich ein Rechteck definieren
        return ( lu_x <= ro_x ) && ( lu_y <= ro_y ) ;
    }
}
