/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/5/2023
 * File Name: TestCoffeeMachine.java
 * Description: This file is for testing Coffee Machine
 */

package assignment1;

import org.junit.Test;
import static org.junit.Assert.assertEquals ;

public class TestCoffeeMachine {

    @Test
    public void testCreateCoffee() {
        Drink myCap = new CoffeeMachine().createCoffee("Cappuccino");
        Drink myEsp = new CoffeeMachine().createCoffee("Espresso");
        Drink myLatte = new CoffeeMachine().createCoffee("LatteMacchiato");

    }

    @Test
    public void testGetUnitMilk() {
        // create a drink that we have
        Drink myDrink = new CoffeeMachine().createCoffee("Espresso");

        // add 2 unit milk
        myDrink.addMilk();
        myDrink.addMilk();

        // after we add 2 unit milk, we are expected to get number 2.
        assertEquals(myDrink.getUnitMilk(), 2);
    }

    @Test
    public void testGetUnitSugar() {
        // create a drink that we have
        Drink myDrink = new CoffeeMachine().createCoffee("Espresso");

        //add 4 unit sugar
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();

        // check if unit sugar is equal to 3 or not
        assertEquals(myDrink.getUnitSugar(), 3);
    }


    @Test
    public void testTotalNumberOfCondiments() {
        // create a drink that we have
        Drink myDrink = new CoffeeMachine().createCoffee("Espresso");

        // add 4 unit milk
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();

        //add 2 unit sugar
        myDrink.addSugar();
        myDrink.addSugar();

        // check whether the total number of condiments is 5
        assertEquals(myDrink.getTotalNumberOfCondiments(), 5) ;
    }

}
