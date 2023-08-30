package FactoryPattern.factorynetwork;

public enum NetworkContains {

    FPT("FPT","Kết nối với mạng FPT","25MB/s",250000),
    VNPT("VNPT","Kết nối với mạng VNPT","50MB/s",400000),
    NEW_NETWORK("NEW_NETWORK","Một mạng mới trong tương lai cần thêm","?",0);
    private String name;
    private String description;
    private String speed;
    private double vnd;

    NetworkContains(String name, String description, String speed, double vnd) {
        this.name = name;
        this.description = description;
        this.speed = speed;
        this.vnd = vnd;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSpeed() {
        return speed;
    }

    public double getVnd() {
        return vnd;
    }
}
