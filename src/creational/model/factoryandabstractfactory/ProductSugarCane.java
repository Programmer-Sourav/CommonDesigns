package creational.model.factoryandabstractfactory;

public class ProductSugarCane extends  EntityCrop implements Crop{


    @Override
    public <T> T getProduct(Class<T> type) throws ClassCastException {
        return (T) new Sugarcane("SugarCane");
    }

    @Override
    public void getInfoAboutItemSourcedFrom() {
        System.out.print("Sugarcane sourced from Karnataka");
    }

    @Override
    public void getItemPricePerKg() {
       System.out.print("Rs. 50/Kg"); //It may be per piece, so it may be a product specific method like getItemPricePerPiece()
    }

    @Override
    public void getItemPricePerTon() {
       System.out.print("Rs. 50000/Ton");
    }
}
