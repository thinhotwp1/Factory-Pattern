/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern.pizzastore;

import FactoryPattern.Pizza.CheesePizzaNY;
import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.VeggiePizzaNY;

/**
 *
 * @author ThinhLD
 */
public class NYStylePizzaStore extends PizzaStore {

    public NYStylePizzaStore() {
    }

    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizzaNY();
                break;
            case "veggie":
                pizza = new VeggiePizzaNY();
                break;
            default:
                return null;
        }

        return pizza;
    }
}
