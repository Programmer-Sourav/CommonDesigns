package creational.model.prototypepattern;

import creational.model.SubClassRice;

// Subclass that customizes the cloned result
public class SubclassRice extends PtCrop {

    private String riceSourcedFrom;
    private String riceSeason;

    public SubclassRice() {}

    public SubclassRice(String cropType, String cropSupplier, String riceSourcedFrom, String riceSeason) {
        super(cropType, cropSupplier); // inherit from abstract class
        this.riceSourcedFrom = riceSourcedFrom;
        this.riceSeason = riceSeason;
    }

    @Override
    public SubclassRice clone() {
        return new SubclassRice(this.cropType, this.cropSupplier, this.riceSourcedFrom, this.riceSeason);
    }

    public void showFullDetails() {
        showDetails(); // from base
        System.out.println("Sourced From: " + riceSourcedFrom + ", Season: " + riceSeason);
    }
}
