package FactoryPattern.pizzastore;

import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.PizzaType;

public abstract class PizzaStore {      // Factory pizza: Nhà máy tạo pizza

    public PizzaStore() {
    }

    abstract Pizza createPizza(PizzaType type);

    public Pizza oderPizza(PizzaType type) {

        Pizza pizza;
        pizza = createPizza(type);
        if (pizza == null) { // Nếu oder sai tên bánh thì pizza sẽ trả về null
            System.out.println("Bad oder, cửa hàng không cung cấp loại bánh đã Oder !");
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
