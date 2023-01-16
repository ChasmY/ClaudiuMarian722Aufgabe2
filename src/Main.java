import Controller.Controller;
import Model.Speisen;
import Model.Zutat;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        View viewLayer = new View();
        //viewLayer.start();
        Controller controller = new Controller();
        Speisen speise = new Speisen(1, "speise");
        Speisen speise1 = new Speisen(2, "speise1");

        Zutat zutat1 = new Zutat(20,"zutat1",3);
        Zutat zutat2 = new Zutat(23,"zutat2", 5);
        Zutat zutat3 = new Zutat(5, "zutat3", 2);

        List<Zutat> zutat = new ArrayList<>();
        zutat.add(zutat1);
        zutat.add(zutat2);
        zutat.add(zutat3);

        controller.insert(speise, zutat);
        controller.insert(speise1, zutat);
        controller.speisenRepo.printAll();

        Zutat zutat4 = new Zutat(25, "zutat4", 5);
        List<Zutat> zutats1 = new ArrayList<>();
        zutats1.add(zutat4);

        controller.insert(speise, zutats1);
        controller.speisenRepo.printAll();
    }
}