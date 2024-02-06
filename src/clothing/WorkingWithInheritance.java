package clothing;

public class WorkingWithInheritance {

    public static void main(String[] args) {

        /*
         * Inheritance allows one class to be derived from another
         * Field and methods are written in one class, and then inherited by other classes
         *
         * */

        Clothing clothing = new Clothing(1,"random clothing", 'R',0.30);

        Shirt shirt = new Shirt(100,"the best shirt", 'Y', 2.20, 'S');


        shirt.display(shirt.itemID, shirt.desc, shirt.colorCode, shirt.price, shirt.getFit());

        Shirt shirt1 =  new Shirt('L');

        shirt1.display(shirt1.itemID, shirt1.desc, shirt1.colorCode, shirt1.price, shirt1.getFit());



        System.out.println("done!");
    }
}
