package by.tms.lesson17.onl30.record_and_sealed.sealed;

public sealed class Pear extends Fruit permits SortPear {
    public Pear(String name, double price) {
        super(name, price);
    }
}
