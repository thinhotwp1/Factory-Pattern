package FactoryPattern.config;

public class FPTConfig extends ConfigNetwork {
    private String configPort = "9999"; // cấu hình khác của fpt

    public String showPort(){      // Method riêng của nhà mạng FPT
        return "Port của FPT là: "+ configPort;
    }

    public FPTConfig(String name, String description, String speed, double vnd ) {
        super(name, description, speed, vnd);
    }
}
