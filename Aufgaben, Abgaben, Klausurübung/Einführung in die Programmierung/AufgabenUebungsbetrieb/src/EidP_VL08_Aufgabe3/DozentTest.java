package EidP_VL08_Aufgabe3;

public class DozentTest {
    public static void main(String[] args) {
        //Erstellung der Objekte aus Klasse Dozent
        Dozent dieDozentin = new Dozent("Frau","Sachkunde", 'w');
        Dozent derDekan = new Dozent("Herr","leitung",'m');

        System.out.println(
                "Name: "+dieDozentin.getName()+"\n"+
                "Lehrgebiet: "+dieDozentin.getLehrgebiet()+"\n"+
                "Dekan?: "+dieDozentin.isDekan()+"\n"+
                "Geschlecht: "+dieDozentin.getGeschlecht()+"\n"
        );
        derDekan.setDekan(true);
        System.out.println("Dekan?: "+derDekan.isDekan());


    }
}
