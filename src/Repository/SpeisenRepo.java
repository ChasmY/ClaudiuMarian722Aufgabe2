package Repository;

import Model.Speisen;
import Model.Zutat;

import java.util.ArrayList;

public class SpeisenRepo implements  CrudRepo<String, Speisen>{

    private final ArrayList<Speisen> alleSpeisen = new ArrayList<>();

    public ArrayList<Speisen> getAlleSpeisen() {
        return alleSpeisen;
    }

    @Override
    public void add(Speisen entity) {
            alleSpeisen.add(entity);
    }

    @Override
    public void delete(Speisen entity) {
        alleSpeisen.remove(entity);
    }

    @Override
        public void update(String string, Speisen newEntity) {
            for(Speisen s: alleSpeisen)
                if(s.getName().equals(string))
                    s=newEntity;
    }
    @Override
    public Speisen findById(String string) {
        for(Speisen s: alleSpeisen)
            if(s.getName().equals(string))
                return s;
        return null;
    }

    public int size(){
        int k = 0;
        for(Speisen s: alleSpeisen)
            k += 1;
        return k;
    }

    public void printAll(){
        for(Speisen s: alleSpeisen){
            System.out.println(s.getName()+" "+s.getZutaten()+" ");
            int counter = 0;
            for(Zutat z: s.getZutaten()){
                counter += 1;
                System.out.println(counter+") "+z.getName()+" "+z.getPreis()+" "+
                        z.getQuantity());
            }
        }
    }
}
