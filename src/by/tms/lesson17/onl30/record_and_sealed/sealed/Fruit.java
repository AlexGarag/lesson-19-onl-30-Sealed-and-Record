package by.tms.lesson17.onl30.record_and_sealed.sealed;

public sealed class Fruit permits Apple, Pear, Cherry {
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
