/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/12/2023
 * File Name: TeaMethod.java
 * Description: This file is for implementing Drink interface
 */

package assignment1;

public class TeaMethod implements Drink {
    private int unitMilk;
    private int unitSugar;

    /**
     * This method is constructor with some initial values
     */
    public TeaMethod() {
        unitMilk = 0;
        unitSugar = 0;
    }

    /**
     * This method is allowed user to add milk
     * @param
     */
    public void addMilk() {
        System.out.println("Sorry, we don't provide milk for tea");
    }

    /**
     * this method is allowed user to add suage
     * @param
     */
    public void addSugar() {
        System.out.println("Sorry, we don't provide sugar for tea");
    }

    /**
     * This method is allowed user to know how much unit milk they added
     * @return int
     */
    public int getUnitMilk() {
        return unitMilk;
    }

    /**
     * This method is allowed user to know how much unit sugar they added
     * @return int
     */
    public int getUnitSugar() {
        return unitSugar;
    }

    /**
     * This method is allowed user to know total number of condiments
     * @return int
     */
    public int getTotalNumberOfCondiments() {
        return getUnitMilk() + getUnitSugar();
    }
}
