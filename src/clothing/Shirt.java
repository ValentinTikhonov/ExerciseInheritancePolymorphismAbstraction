package clothing;

public class Shirt extends Clothing {
    private char fit = 'X';

    public Shirt(int itemID, String desc, char color, double price, char fit) {
        super(itemID, desc, color, price);
        this.fit=fit;
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public Shirt(char fit){
        this(0,"",'R',0,fit);
    }

    public void display(){
        System.out.println("-I am Shirt-");
    }



    // I can't put this method as privet because child can't be more restrictive that method overrides
    public void display(int itemID, String desc, char colorCode, double price, char fit) {
        System.out.println(("-I am a Shirt-").concat("\r\n")
                .concat("id - ".concat(String.valueOf(itemID)).concat("\r\n"))
                .concat("Description - ".concat(desc)).concat("\r\n")
                .concat("Fit - ".concat(String.valueOf(fit))).concat("\r\n")
                .concat("colorCode - ".concat(String.valueOf(colorCode))).concat("\r\n")
                .concat("price - ".concat(String.valueOf(price))).concat("\r\n")
        );
    }
}
