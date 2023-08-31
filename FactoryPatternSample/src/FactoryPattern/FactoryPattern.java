/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryPattern;

import FactoryPattern.Pizza.PizzaType;
import FactoryPattern.pizzastore.ChicagoStylePizzaStore;
import FactoryPattern.pizzastore.NYStylePizzaStore;
import FactoryPattern.pizzastore.PizzaStore;

/**
 *
 * @author ThinhLD
 */
public class FactoryPattern {

    /**
     * Ở trường hợp này thay vì sử dụng Factory Pattern với DI - Dependency Injection để thay đổi cấu hình mong muốn
     *      thì ta sử dụng với các nhà máy khác nhau sẽ tạo kiểu pizza khác nhau,

     * Với NY Store tạo ra VEGGIE_PIZZA và CHEESE_PIZZA và Chicago Store sẽ tạo ra COCA_PIZZA và EGG_PIZZA, (vì cả
     *      2 đều extends nhà máy tạo pizze PizzaStore), tùy theo object Pizza muốn tạo và phải có ở 1 trong các nhà máy tạo Pizza.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("--------------------------- Oder Pizza NY Store ----------------------------");
        PizzaStore NYStore = new NYStylePizzaStore();
        NYStore.oderPizza(PizzaType.VEGGIE_PIZZA);
        NYStore.oderPizza(PizzaType.COCA_PIZZA); // show bad request vì NY Store không cung cấp COCA_PIZZA
        NYStore.oderPizza(PizzaType.CHEESE_PIZZA);

        System.out.println("----------------------------------------------------------------------------");
        
        System.out.println("------------------------- Oder Pizza Chicago Store -------------------------");
        PizzaStore ChicagoStore = new ChicagoStylePizzaStore();
        ChicagoStore.oderPizza(PizzaType.COCA_PIZZA);
        ChicagoStore.oderPizza(PizzaType.VEGGIE_PIZZA); // show bad request vì Chicago Store không cung cấp VEGGIE_PIZZA
        ChicagoStore.oderPizza(PizzaType.EGG_PIZZA);

        System.out.println("----------------------------------------------------------------------------");
    }

}
