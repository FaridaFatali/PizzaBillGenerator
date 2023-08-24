package org.example;

/**
 * Practice: <a href="https://www.youtube.com/watch?v=m-_ytU_B4so">...</a>
 *
 * @author Farida Fatali
 * Creating a Pizza Bill Generator in Java
 */

public class Main {
    public static void main(String[] args) {

        // You can choose one of these options and additions (for vegetarian or non-vegetarian pizza. here we choose vegetarian)
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();

        // Or both of them together as a deluxe pizza (here we choose non-vegetarian pizza)
        DeluxePizza deluxePizza = new DeluxePizza(false);
        deluxePizza.takeAway();
        deluxePizza.getBill();
        
    }
}