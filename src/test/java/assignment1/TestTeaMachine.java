/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/5/2023
 * File Name: TestTeaMachine.java
 * Description: This file is for testing our tea machine
 */

package assignment1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTeaMachine {
    @Test
    public void testCreateTea() {
        Drink myBlackTea = new TeaMachine().createTea("Black Tea");
        Drink myGreenTea = new TeaMachine().createTea("Green Tea");
        Drink myYellowTea = new TeaMachine().createTea("Yellow Tea");

    }

    @Test
    public void testGetMilk() {
        // create a tea that we have
        Drink myDrink = new TeaMachine().createTea("Black Tea");

        // suppose we add two unit milk
        myDrink.addMilk();
        myDrink.addMilk();

        // since we don't provide milk for tea, so the result is 0
        assertEquals(myDrink.getUnitMilk(), 0);
    }

    @Test
    public void testGetSugar() {
        // create a tea that we have
        Drink myDrink = new TeaMachine().createTea("Black Tea");

        // suppose we add two unit sugar
        myDrink.addSugar();
        myDrink.addSugar();

        // since we also don't provide sugar for tea, so the result is 0
        assertEquals(myDrink.getUnitSugar(), 0);
    }


    @Test
    public void testGetNumberOfCondiments() {
        // create a tea that we have
        Drink myDrink = new TeaMachine().createTea("Black Tea");

        // suppose we add two unit milk and two unit sugar
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addMilk();;
        myDrink.addMilk();

        // since we also don't provide sugar and tea for tea, so the result is 0
        assertEquals(myDrink.getTotalNumberOfCondiments(), 0);
    }


}
