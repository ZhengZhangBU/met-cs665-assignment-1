/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/5/2023
 * File Name: CoffeeMachine.java
 * Description: This file is for creating a coffee in the coffee machine
 */

package assignment1;

public class CoffeeMachine  {
    /**
     * constructor
     */
    public CoffeeMachine() {

    }

    /**
     * This method is to create a coffee that exists in our list
     * and display message if they successfully ordered a coffee
     * @param coffeeType
     */
    public Drink createCoffee(String coffeeType) {
        Drink coffee = null;

        if (coffeeType.equals("Espresso")) {
            coffee = new Espresso();
        } else if (coffeeType.equals("Americano")) {
            coffee = new Americano();
        } else if (coffeeType.equals("Latte Macchiato")) {
            coffee = new LatteMacchiato();
        } else {
            System.out.println("Sorry, we don't have " + coffeeType);
        }

        return coffee;
    }
}
