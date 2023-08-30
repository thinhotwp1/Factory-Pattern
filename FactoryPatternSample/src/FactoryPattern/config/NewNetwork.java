package FactoryPattern.config;

public class NewNetwork extends ConfigNetwork {

    public NewNetwork(String name, String description, String speed, double vnd) {
        super(name, description, speed, vnd);
    }

    public String methodRieng(){
        return "Method riêng của network trong tương lai";
    }
}
