package by.tms.lesson17.onl30.record_and_sealed;

import by.tms.lesson17.onl30.record_and_sealed.sealed.Apple;
import by.tms.lesson17.onl30.record_and_sealed.sealed.Cherry;
import by.tms.lesson17.onl30.record_and_sealed.sealed.Pear;
import by.tms.lesson17.onl30.record_and_sealed.sealed.SortPear;

public class ExecutorSealed {
    public static void main(String[] args) {
        Cherry cherry = new Cherry("cherry", 2.0);
        Pear pear = new Pear("pear", 3.0);
        Apple apple = new Apple("apple", 4.0);
        SortPear sortPear = new SortPear("sortPear", 5.0);

        if (pear.getClass().isSealed()) {
            System.out.println("Sealed pear");
        }

        Class<? extends Pear> sealedClasses = pear.getClass();
        Class<?>[] permittedSubclasses = sealedClasses.getPermittedSubclasses();
        for (Class<?> sc : permittedSubclasses){
            System.out.println(sc.getName());
        }
    }
}
