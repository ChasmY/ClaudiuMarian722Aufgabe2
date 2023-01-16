package Controller;

import Model.Speisen;
import Model.Zutat;
import Repository.SpeisenRepo;

import java.util.List;

public class Controller {
    public SpeisenRepo speisenRepo = new SpeisenRepo();


    public void insert(Speisen speise, List<Zutat> zutatenList) {
        boolean foundSpeise = false;
        for (Speisen speise1 : speisenRepo.getAlleSpeisen()) {
            if (speise1.getName().equals(speise.getName())) {
                foundSpeise = true;
                for (Zutat z : zutatenList) {
                    boolean found = false;
                    for (int i = 0; i < speise1.getZutaten().size(); i++) {
                        if (z.getName() == speise1.getZutaten().get(i).getName()) {
                            found = true;
                            speise1.getZutaten().set(i, z);
                            break;
                        }
                    }
                    if (!found)
                        speise1.getZutaten().add(z);
                }
            }
        }
        if (!foundSpeise) {
            speise.setZutaten(zutatenList);
            speisenRepo.add(speise);
        }
    }



}
