/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryPattern;

import FactoryPattern.pizzastore.ChicagoStylePizzaStore;
import FactoryPattern.pizzastore.NYStylePizzaStore;
import FactoryPattern.pizzastore.PizzaStore;

/**
 *
 * @author Administrator
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===== Oder pizza egg cafe more machiato =====");
        
        System.out.println("=== Oder NYPizza ===");
        PizzaStore NYStore = new NYStylePizzaStore();
        NYStore.oderPizza("cheese");
        NYStore.oderPizza("cheesee"); // show bad request
        NYStore.oderPizza("veggie");
        
        System.out.println("=== Oder ChicagoPizza ===");
        PizzaStore ChicagoStore = new ChicagoStylePizzaStore();
        ChicagoStore.oderPizza("egg");
        ChicagoStore.oderPizza("milk"); // show bad request
        ChicagoStore.oderPizza("coca");
       
        System.out.println("===== End oder pizza =====");
    }

}
