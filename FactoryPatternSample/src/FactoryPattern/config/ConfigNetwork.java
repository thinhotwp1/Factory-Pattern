package FactoryPattern.config;

public abstract class ConfigNetwork {
    private String name;
    private String description;
    private String speed;
    private double vnd;

    public ConfigNetwork() {
    }

    public ConfigNetwork(String name, String description, String speed, double vnd) {
        this.name = name;
        this.description = description;
        this.speed = speed;
        this.vnd = vnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpeed() {
        return speed;
    }

    public double getVnd() {
        return vnd;
    }

    public void setVnd(double vnd) {
        this.vnd = vnd;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String motaNetwork(){ //method chung của các nhà mạng, có thể sử dụng hoặc override
        return this.toString();
    }

    @Override
    public String toString() {
        return "ConfigNetwork{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", speed=" + speed +
                ", vnd=" + vnd +
                '}';
    }
}