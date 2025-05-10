package creational.model.prototypepattern;

public abstract  class PtCrop implements Cloneable{
    String cropType;
    String cropSupplier;

    public PtCrop(){

    }
    public PtCrop(String cropType, String cropSupplier) {
        this.cropType = cropType;
        this.cropSupplier = cropSupplier;
    }

    public abstract PtCrop clone();

    public void showDetails(){
        System.out.print("Crop Details "+cropType +", "+cropSupplier);
    }
}
