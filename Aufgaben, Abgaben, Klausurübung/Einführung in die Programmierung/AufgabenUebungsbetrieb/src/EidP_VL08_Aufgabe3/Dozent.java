package EidP_VL08_Aufgabe3;

public class Dozent {

    //Attribute
    String name;
    String lehrgebiet;
    boolean dekan = false;
    char geschlecht;

    //Konstruktor
    public Dozent(String name, String lehrgebiet, char geschlecht) {
        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.geschlecht = geschlecht;
    }

    //Methoden

    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }
    public void setDekan(boolean dekan) {
        this.dekan = dekan;
    }
    public void setGeschlecht(char geschlecht) {
        this.geschlecht= geschlecht;
    }

    //Getter

    public String getName() {
        return this.name;
    }
    public String getLehrgebiet() {
        return this.lehrgebiet;
    }
    public boolean isDekan() {
        return this.dekan;
    }
    public char getGeschlecht() {
        return this.geschlecht;
    }
}
