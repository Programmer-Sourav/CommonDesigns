package creational.model.factoryandabstractfactory;

public class ProductRice extends EntityCrop implements  Crop{

    @Override
    public <T> T getProduct(Class<T> type) throws ClassCastException {
        return (T) new Rice("Winter Seasonal Rice");
    }

    @Override
    public void getInfoAboutItemSourcedFrom() {
        System.out.print("Sourced From Punjab");
    }

    @Override
    public void getItemPricePerKg() {
        System.out.print("Rs 100/Kg");
    }

    @Override
    public void getItemPricePerTon() {
      System.out.print("Rs 100000/Ton");
    }
}
