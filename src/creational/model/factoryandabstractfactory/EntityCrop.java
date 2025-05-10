package creational.model.factoryandabstractfactory;

public  abstract  class EntityCrop  {
    public <T> T getProduct( Class<T> type) throws ClassCastException {
        return (T) type;
    }
}
