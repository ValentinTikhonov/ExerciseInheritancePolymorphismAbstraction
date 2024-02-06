package clothing_abstraction;

public class Socks extends Clothing{

    private double price;

    public Socks(int id, double price) {
        this.setId(id);
        this.price = price;
    }

    @Override
    protected double getPrice() {
        System.out.println(price);
        return price;
    }

    @Override
    protected void display() {
        System.out.println("Price is ".concat(String.valueOf(this.getPrice())));
        System.out.println("Id is ".concat(String.valueOf(this.getId())));
    }
}
