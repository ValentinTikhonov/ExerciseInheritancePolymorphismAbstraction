package clothing;

public class Trousers extends Clothing {


    public Trousers(int itemID, String desc, char color, double price) {
        super(itemID, desc, color, price);

    }

    public void display(){
        System.out.println("-I am Trouser-");
    }



    // I can't put this method as privet because child can't be more restrictive that method overrides
    public void display(int itemID, String desc, char colorCode, double price) {
        System.out.println(("-I am Trouser-").concat("\r\n")
                .concat("id - ".concat(String.valueOf(itemID)).concat("\r\n"))
                .concat("Description - ".concat(desc)).concat("\r\n")
//                .concat("Fit - ".concat(String.valueOf(fit))).concat("\r\n")
                .concat("colorCode - ".concat(String.valueOf(colorCode))).concat("\r\n")
                .concat("price - ".concat(String.valueOf(price))).concat("\r\n")
        );
    }
}
