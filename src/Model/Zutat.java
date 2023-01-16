package Model;

public class Zutat {
    private int preis, quantity;
    private String name;


    public Zutat(int preis, String name, int quantity) {
        this.preis = preis;
        this.name = name;
        this.quantity = quantity;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
