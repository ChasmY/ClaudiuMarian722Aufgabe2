package Repository;

import Model.Speisen;
import Model.Zutat;

import java.util.ArrayList;

public class ZutatenRepo implements  CrudRepo<String, Zutat>{
    private ArrayList<Zutat> alleZutaten = new ArrayList<>();

    public ArrayList<Zutat> getAlleZutaten() {
        return alleZutaten;
    }


    @Override
    public void add(Zutat entity) {
            alleZutaten.add(entity);
    }

    @Override
    public void delete(Zutat entity) {
        alleZutaten.remove(entity);
    }

    @Override
    public void update(String s, Zutat newEntity) {
        for(Zutat z: alleZutaten)
            if(z.getName().equals(s))
                z=newEntity;
    }

    @Override
    public Zutat findById(String s) {
        for(Zutat z: alleZutaten)
            if(z.getName().equals(s))
                return z;
        return null;
    }

    public int size(){
        int k = 0;
        for(Zutat z: alleZutaten)
            k += 1;
        return k;
    }


}

