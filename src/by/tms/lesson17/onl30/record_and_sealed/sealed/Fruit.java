package by.tms.lesson17.onl30.record_and_sealed.sealed;

public sealed abstract class Fruit permits Apple, Pear, Cherry {
    String name;
    double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
