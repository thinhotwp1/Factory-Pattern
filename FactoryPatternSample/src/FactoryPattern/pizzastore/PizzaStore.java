package FactoryPattern.pizzastore;

import FactoryPattern.Pizza.Pizza;

public abstract class PizzaStore {

    public PizzaStore() {
    }

    abstract Pizza createPizza(String type);

    public Pizza oderPizza(String type) {

        Pizza pizza;
        pizza = createPizza(type);
        if (pizza == null) { // Nếu oder sai tên bánh thì pizza sẽ trả về null
            System.out.println("Bad oder !");
        } else {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            pizza.display();
        }

        return pizza;
    }

}
