package clothing_abstraction;

public class WorkingWithAbstractClasses {

    public static void main(String[] args) {

        /*

        When architecting our programs, if we end up using inheritance at all, we will notice that sometimes our superclasses make sense as objects that should be instantiated, and sometimes they do not.

[Video description begins] Abstract Classes. Four boxes are displayed. The first box is labeled as Shirt. It contains the getFit() method. The second box is labeled as Trousers. It contains the getFit() and getGender() methods. The third box is labeled as Clothing. It contains the getId(), display(), getPrice(), getSize(), and getColor() methods. The fourth box is labeled as Socks. It is empty. [Video description ends]

For example, our shopping cart app for Duke's Choice carries different kinds of clothes, like shirts, socks and trousers. And classes representing these three items all inherit from a parent class Clothing, that encapsulates the things common among them. In our app, as part of its normal operating procedure, you would actually instantiate items using our classes, shirt, trousers, and socks.

But if you look at the parent class clothing, we note that there is never going to be an individual item Duke carries that is ever going to be of type clothing. So we would not likely be creating instances of clothing. In cases like this, where a parent class helps us to organize our code architecture, but we don't actually want instances of that class, we can mark it as abstract. Abstract classes are marked using the abstract keyword ahead of the class declaration. As we touched on, once a class is abstract, it cannot be instantiated, which is actually enforced by the compiler.

[Video description begins] A code is given. It is Clothing cloth01=new Clothing(). [Video description ends]

The class may still have concrete methods. And in addition to those, it may also have abstract methods.

[Video description begins] Use the abstract keyword to create a special class that may contain abstract methods that must be implemented later by any non-abstract subclasses. A code is displayed. It is, code starts: public abstract class Clothing{ private int id; public int getId(){ return id; } public abstract double getPrice(); public abstract void display(); }. Code ends. The public int getId(){ return id; } code is labeled as concrete method. The public abstract double getPrice(); public abstract void display(); code lines are labeled as abstract methods. [Video description ends]

These are methods which are defined in the class, but contain no body. And it's up to the subclasses to provide their own implementations. Abstract methods are useful when it makes sense to define a method in the superclass, so it's available on all of the subclasses. But any actual implementation depends heavily on the subclass itself. So it can only be defined within that class. In the snippet on screen, the class Clothing has been marked as abstract. So at this point, it can only be subclassed. And it can no longer be instantiated.

It does still have a concrete property id, and also a concrete method getId that is always going to be available to all subclasses. In addition to them, it defines two abstract methods, getPrice and display. As you'll notice, marking the methods as abstract is done with the same keyword, abstract. And as you can see, the methods are just stubs with no actual implementation. It's going to be up to any subclasses of Clothing to provide concrete implementations of these methods. One thing I'll point out here is that once these methods are marked as abstract, subclasses will be required to provide implementations.

And this too is going to be enforced at compile time. You can think of abstract methods as defining a contract between an abstract class and any of its subclasses.

[Video description begins] Extending Abstract Classes. Two codes are displayed. The first code is, code starts: public abstract class Clothing{ private int id; public int getId(){ return id; } protected abstract double getPrice(); public abstract void display(); }. Code ends. The second code is, code starts: public class Socks extends Clothing{ private double price; protected double getPrice(){ return price; } public void display(){ System.out.println(“ID: ”+getID()); System.out.println(“Price: $”+getPrice()); }}. Code ends. [Video description ends]

Looking further into our ongoing example now, one possible subclass of clothing is socks. It goes on to define its own field, price, which is what it returns when it provides a concrete implementation of the getPrice method.

[Video description begins] The code, code starts: private double price; protected double getPrice(){ return price; }. Code ends. is highlighted. [Video description ends]

As we now know, it also has to provide a concrete implementation of the display method.

[Video description begins] The code, code starts: public void display(){ System.out.println(“ID: ”+getID()); System.out.println(“Price: $”+getPrice());. Code ends. is highlighted. [Video description ends]

And we see here that in its body, it logs out a couple of lines on the console. In the first line, it calls a method getId, which we recognize as coming from the parent class Clothing. And on the second line, it actually calls the getPrice method, which we've already seen is abstract in the parent, and concretely implemented here in the child Socks.
        *
        * */

      //  Clothing clothing = new Clothing()

        Socks socks = new Socks(7, 12.50);

        socks.setId(3);
        socks.display();
    }
}
