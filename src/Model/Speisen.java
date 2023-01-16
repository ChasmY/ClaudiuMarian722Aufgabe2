package Model;

import java.util.ArrayList;
import java.util.List;

public class Speisen {
    private int id;
    private String Name;

    List<Zutat> zutaten;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Zutat> getZutaten() {
        return zutaten;
    }

    public void setZutaten(List<Zutat> zutaten) {
        this.zutaten = zutaten;
    }

    public Speisen(int id, String name) {
        this.id = id;
        Name = name;
        this.zutaten = new ArrayList<>();
    }
}
