package dev.arturo;

import dev.arturo.models.AmstrongNumber;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        AmstrongNumber amstrongNumber = new AmstrongNumber();

        System.out.println(amstrongNumber.calcIfIsAmstrongNumber(371));
        System.out.println(amstrongNumber.calcIfIsAmstrongNumber(777));
    }
}
