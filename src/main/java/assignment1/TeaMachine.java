/**
 * Name: Zheng Zhang
 * Course: CS-665 Software Designs & Patterns
 * Date: 2/5/2023
 * File Name: TeaMachine.java
 * Description: This file is for creating a tea
 */

package assignment1;

public class TeaMachine{

    /**
     * constructor
     */
    public TeaMachine() {

    }

    /**
     * This method is to create a tea that exists in our list
     * and display message if they successfully ordered a tea
     * @param teaType
     */
    public Drink createTea(String teaType) {
        Drink tea = null;

        if (teaType.equals("Black Tea")) {
            tea = new BlackTea();
        } else if (teaType.equals("GreenTea")) {
            tea = new GreenTea();
        } else if (teaType.equals("YellowTea")) {
            tea = new YellowTea();
        }

        return tea;
    }


}
