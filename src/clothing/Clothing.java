package clothing;

public class Clothing {

    public int itemID = 0;
    public String desc = "-description required";
    public char colorCode = 'U' ;
    public char size = '-';

    public double price=0.0;

    public Clothing(int itemID, String desc, char colorCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = colorCode;
        this.price = price;
    }
    public void display(int itemID, String desc, char colorCode, double price) {
        System.out.println(("-I am a generic priece of clothing-").concat("\r\n")
                .concat("id - ".concat(String.valueOf(itemID)).concat("\r\n"))
                .concat("Description - ".concat(desc)).concat("\r\n")
                .concat("colorCode - ".concat(String.valueOf(colorCode))).concat("\r\n")
                .concat("price - ".concat(String.valueOf(price))).concat("\r\n")
        );
    }
    public void display(){
        System.out.println("-I am default clothing-");
    }

    public void setSize(char size) {
        this.size = size;
    }


}
