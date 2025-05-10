package creational.model.factoryandabstractfactory;

public class Sugarcane {
    private String cropType;

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public Sugarcane(String cropType) {
        this.cropType = cropType;
    }
}
