/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryPattern;

import FactoryPattern.config.ConfigNetwork;
import FactoryPattern.config.FPTConfig;
import FactoryPattern.config.NewNetwork;
import FactoryPattern.config.VNPTConfig;
import FactoryPattern.factorynetwork.FactoryNetwork;
import FactoryPattern.factorynetwork.NetworkContains;

/**
 *
 * @author ThinhLD
 */
public class FactoryPattern {

    /**
     * @param args
     * Factory pattern sample: DI-Dependency Injection
     */

    public static void main(String[] args) {
        // TODO code application logic here
        FactoryNetwork factoryNetwork = new FactoryNetwork();
        System.out.println("Khởi tạo mạng dựa theo nhu cầu, không quan tâm tới cách khởi tạo của đối tượng. ");

        System.out.println("--------------------------------------------------------------------------------------------------");
        // FPT
        FPTConfig fptConfig = (FPTConfig) factoryNetwork.chooseNetwork(NetworkContains.FPT);
        System.out.println(fptConfig.motaNetwork());
        System.out.println(fptConfig.showPort());

        System.out.println("--------------------------------------------------------------------------------------------------");
        // VNPT
        VNPTConfig vnptConfig = (VNPTConfig) factoryNetwork.chooseNetwork(NetworkContains.VNPT);
        System.out.println(vnptConfig.motaNetwork());
        System.out.println(vnptConfig.showLAN());

        System.out.println("--------------------------------------------------------------------------------------------------");
        // Another network
        NewNetwork newNetwork = (NewNetwork) factoryNetwork.chooseNetwork(NetworkContains.NEW_NETWORK);
        System.out.println(newNetwork.motaNetwork());
        System.out.println(newNetwork.methodRieng());

        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Factory pattern giúp giảm sự phụ thuộc, dễ dàng maintain và bảo tri," +
                " cụ thể ở đây là không cần sửa trực tiếp lớp cha,\nchỉ cần sửa hoặc thêm các lớp con trong tương lai, đóng để sửa chữa và mở để mở rộng (Open/Closed Principle)");
    }

}
