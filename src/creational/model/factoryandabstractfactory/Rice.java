package creational.model.factoryandabstractfactory;

public class Rice {
    public String getRiceType() {
        return riceType;
    }

    public void setRiceType(String riceType) {
        this.riceType = riceType;
    }

    public Rice(String riceType) {
        this.riceType = riceType;
    }

    private String riceType;

}
