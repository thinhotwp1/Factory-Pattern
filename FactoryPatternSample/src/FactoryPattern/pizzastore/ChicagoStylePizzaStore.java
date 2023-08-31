/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern.pizzastore;

import FactoryPattern.Pizza.*;

/**
 *
 * @author ThinhLD
 */
public class ChicagoStylePizzaStore extends PizzaStore {// Tùy chọn loại bánh pizza sẽ tạo ra ở nhà máy Chicago bằng cách implement createPizza

    public ChicagoStylePizzaStore() {
    }

    public Pizza createPizza(PizzaType type) {

        Pizza pizza;
        if (type.equals(PizzaType.EGG_PIZZA)) {
            pizza = new EggPizzaChicago();
        } else if (type.equals(PizzaType.COCA_PIZZA)) {
            pizza = new CocaPizzaChicago();
        } else {
            return null;
        }

        return pizza;
    }
}
