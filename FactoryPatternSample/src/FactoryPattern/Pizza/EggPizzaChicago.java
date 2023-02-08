/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern.Pizza;

/**
 *
 * @author Administrator
 */
public class EggPizzaChicago extends Pizza{

    public EggPizzaChicago() {
        description = "EggPizzaChicago";
    }
    
    @Override
    public void box() {
        this.description += " + 2 box ";
        /* các method ít sửa đổi được gom vào class Pizza nếu 
        cần thay đổi thì chỉ cần overide */
    }
}
