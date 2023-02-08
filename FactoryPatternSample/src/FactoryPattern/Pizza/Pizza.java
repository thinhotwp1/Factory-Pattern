/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern.Pizza;

/**
 *
 * @author Administrator
 */
public abstract class Pizza {

    public String description = "Pizza Normal";

    public void prepare() {
        this.description += " + prepare";
    }

    public void bake() {
        this.description += " + bake ";
    }

    public void cut() {
        this.description += " + cut ";
    }

    public void box() {
        this.description += " + box ";
    }

    public void display() {
        System.out.println(this.description);
    }
}
