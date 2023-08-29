/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern.pizzastore;

import FactoryPattern.Pizza.CheesePizzaNY;
import FactoryPattern.Pizza.CocaPizzaChicago;
import FactoryPattern.Pizza.EggPizzaChicago;
import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.VeggiePizzaNY;

/**
 *
 * @author ThinhLD
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore() {
    }

    public Pizza createPizza(String type) {

        Pizza pizza;
        switch (type) {
            case "egg":
                pizza = new EggPizzaChicago();
                break;
            case "coca":
                pizza = new CocaPizzaChicago();
                break;
            default:
                return null;
        }

        return pizza;
    }
}
