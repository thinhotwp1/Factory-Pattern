package FactoryPattern.Pizza;

public enum PizzaType {

    CHEESE_PIZZA("cheese"),
    VEGGIE_PIZZA("veggie"),
    EGG_PIZZA("egg"),
    COCA_PIZZA("coca"),
    ;
    private String name;

    PizzaType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
