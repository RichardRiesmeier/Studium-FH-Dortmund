package EidP_UEB08_Aufgabe4;

public class Punkt2D {
    //attributes
    private double x;
    private double y;

    //constructor
    Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //methods
    double getX() {
        return this.x;
    }
    double getY() {
        return this.y;
    }
    void setX(double x) {
        this.x=x;
    }
    void setY(double y) {
        this.y=y;
    }
}
