/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/12/2023
 * File Name: CoffeeMethod.java
 * Description: This file is for implementing Drink interface
 */

package assignment1;

public class CoffeeMethod implements Drink {
    private int unitMilk;
    private int unitSugar;

    /**
     * This method is constructor with some initial values
     */
    public CoffeeMethod() {
        unitMilk = 0;
        unitSugar = 0;
    }

    /**
     * This method is allowed user to add milk
     * @param
     */
    public void addMilk() {
        if (0 <= unitMilk && unitMilk < 3) {
            unitMilk += 1;
            System.out.println("Add milk successfully!");
        }
        else
            System.out.println("You are only allowed to add 3 unit milk!");
    }

    /**
     * this method is allowed user to add suage
     * @param
     */
    public void addSugar() {
        if (0 <= unitSugar && unitSugar < 3) {
            unitSugar += 1;
            System.out.println("Add Sugar Successfully!");
        } else
            System.out.println("You are only allowed to add 3 unit sugar!");
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
