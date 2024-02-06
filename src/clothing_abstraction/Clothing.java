package clothing_abstraction;

public abstract class Clothing {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected abstract double getPrice();
    protected abstract void display();
}
