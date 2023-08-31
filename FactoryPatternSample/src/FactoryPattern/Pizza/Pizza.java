/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern.Pizza;

/**
 *
 * @author ThinhLD
 */
public abstract class Pizza {      // Lớp cha của các loại Pizza muốn khởi tạo chứa các method và trường chung

    public String description = "Pizza Normal";

    public void prepare() {
        this.description += " + Chuẩn bị ";
    }

    public void bake() {
        this.description += " + Nấu bánh ";
    }

    public void cut() {
        this.description += " + Cắt bánh ";
    }

    public void box() {
        this.description += " + Gói hàng ";
    }

    public void display() {
        System.out.println(this.description);
    }
}
