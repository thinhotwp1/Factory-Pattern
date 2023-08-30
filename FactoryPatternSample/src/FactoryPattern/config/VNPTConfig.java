package FactoryPattern.config;

public class VNPTConfig extends ConfigNetwork {
    private String configLAN = "Mạng LAN căng đét"; // cấu hình khác của fpt

    public VNPTConfig(String name, String description, String speed, double vnd) {
        super(name, description, speed, vnd);
    }

    public String showLAN() {      // Method riêng của nhà mạng VNPT
        return "Cấu hình LAN của VNPT là: " + configLAN;
    }
}
