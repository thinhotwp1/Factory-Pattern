/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern.Pizza;

/**
 *
 * @author ThinhLD
 */
public class EggPizzaChicago extends Pizza{

    public EggPizzaChicago() {
        description = "Egg Pizza Chicago";
    }
    
    @Override
    public void box() {
        this.description += " + Gói cẩn thận hàng dễ hỏng  ";
        /* các method ít sửa đổi được gom vào class Pizza nếu 
        cần thay đổi thì chỉ cần overide */
    }

}
