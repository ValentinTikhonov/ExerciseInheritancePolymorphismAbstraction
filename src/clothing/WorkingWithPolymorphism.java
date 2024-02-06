package clothing;

public class WorkingWithPolymorphism {

    public static void main(String[] args) {

        /*
         * Polymorphism means that the same message to two defferent objects can have dfferent results
         * "Good night" to a child means "Start getting ready for bed"
         * "Good night" to a parent means "Read a bedtime story"
         *
         * In Java, it means the same method is implemented differently by different classes
         * This is especially powerful in the context of inheritance
         * It relies upon the "is a" relationship
         *
         * Use inheretance only when it is completely valid or unavoidable
         *
         * Use the "is a" test to decide whether an inheritance relationship makes sense
         *
         * So far, you have referenced objects only with a reference variable of the same class:
         * To use the Shirt class as the reference type for the Shirt object:
         *
         * Shirt myShirt = new Shirt();
         *
         * But you can also use the superclass as the reference:
         *
         * Clothing garment1 = new Shirt();
         * Clothing garment2 = new Trousers();
         * Shirt is a (type of) Clothing.
         *
         * Clothing c1 = new ??? ();
         *
         * c1.display(); c1 ----> could be a Shirt, Trousers, or Socks object
         *
         * The method will be implemented differently on different types of objects. For example:
         *
         * Trousers objects show more fields in the display method
         *
         * Different subclasses accept a different subset of valid color codes
         *
         * */

        Clothing clothing = new Clothing(1,"random clothing", 'R',0.30);

        Clothing garment1 = new Shirt(100,"the best shirt", 'R', 2.20, 'S');


       // garment1.display(garment1.itemID, garment1.desc, garment1.colorCode, garment1.price, garment1.getFit());

        Clothing garment2 = new Trousers(100,"trousers", 'Y', 10.20);

       // garment2.display(garment2.itemID, garment2.desc, garment2.colorCode, garment2.price);

        Clothing[] allCloths = { garment1, garment2};

        displayClothes(allCloths);

        System.out.println("done!");


       // garment1.getFit();   ---> Error
        char fit= ((Shirt) garment1).getFit();
        System.out.println("This shirt has a fit of --> ".concat(String.valueOf(fit)));
    }

    private static void displayClothes(Clothing[] allCloths) {
        for (Clothing c: allCloths){
            c.display();
            if(c instanceof Shirt){
              char fit = ((Shirt) c).getFit();
              System.out.println("This shirt has a fit of --> ".concat(String.valueOf(fit)));
            };
        }
    }

}
