package FactoryPattern.factorynetwork;

import FactoryPattern.config.ConfigNetwork;
import FactoryPattern.config.FPTConfig;
import FactoryPattern.config.NewNetwork;
import FactoryPattern.config.VNPTConfig;

public class FactoryNetwork {

    public ConfigNetwork chooseNetwork(NetworkContains networkContains) {
        NetworkContains networkFPT = NetworkContains.FPT;
        NetworkContains networkVNPT = NetworkContains.VNPT;
        NetworkContains networkFuture = NetworkContains.NEW_NETWORK;

        // Sử dụng mạng FPT
        if (networkContains.equals(networkFPT)) {
            return new FPTConfig(networkFPT.getName(), networkFPT.getDescription(), networkFPT.getSpeed(), networkFPT.getVnd());
        }
        // Sử dụng mạng VNPT
        if (networkContains.equals(networkVNPT)) {
            return new VNPTConfig(networkVNPT.getName(), networkVNPT.getDescription(), networkVNPT.getSpeed(), networkVNPT.getVnd());
        }
        // Sử dụng mạng mới cần thêm trong tương lai
        if (networkContains.equals(networkFuture)) {
            return new NewNetwork(networkFuture.getName(), networkFuture.getDescription(), networkFuture.getSpeed(), networkFuture.getVnd());
        }

        // Nếu không chọn thì sử dụng mặc định mạng FPT
        return new FPTConfig(networkFPT.getName(), networkFPT.getDescription(), networkFPT.getSpeed(), networkFPT.getVnd());
    }
}
