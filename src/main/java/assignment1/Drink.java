/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/12/2023
 * File Name: Drink.java
 * Description: This file is for creating a Drink interface
 */

package assignment1;

public interface Drink {
    /**
     * This method is to add milk for hot beverages
     * @param
     */
    void addMilk();

    /**
     * This method is to add sugar for hot beverages
     * @param
     */
    void addSugar();

    /**
     * This method is to get the number of unit milk
     * @return int
     */
    int getUnitMilk();

    /**
     * This method is to get the number of unit sugar
     * @return int
     */
    int getUnitSugar();

    /**
     * This method is to get the total number of condiments that we add
     * @return int
     */
    int getTotalNumberOfCondiments();
}
