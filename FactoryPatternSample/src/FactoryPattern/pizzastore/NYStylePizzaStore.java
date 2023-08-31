/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern.pizzastore;

import FactoryPattern.Pizza.CheesePizzaNY;
import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.PizzaType;
import FactoryPattern.Pizza.VeggiePizzaNY;

/**
 *
 * @author ThinhLD
 */
public class NYStylePizzaStore extends PizzaStore { // Tùy chọn loại bánh pizza sẽ tạo ra ở nhà máy NY bằng cách implement createPizza

    public NYStylePizzaStore() {
    }

    public Pizza createPizza(PizzaType type) {
        Pizza pizza;

        if (type.equals(PizzaType.CHEESE_PIZZA)) {
            pizza = new CheesePizzaNY();
        } else if (type.equals(PizzaType.VEGGIE_PIZZA)) {
            pizza = new VeggiePizzaNY();
        } else {
            return null;
        }

        return pizza;
    }
}
