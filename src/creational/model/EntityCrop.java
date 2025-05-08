package creational.model;

public  abstract  class EntityCrop  {
    public <T> T getProduct( Class<T> type) throws ClassCastException {
        return (T) type;
    }
}
