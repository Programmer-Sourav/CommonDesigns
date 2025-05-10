import creational.model.*;
import creational.model.factoryandabstractfactory.*;
import creational.model.prototypepattern.SubclassRice;
import creational.model.singletondesignpattern.DummyApplicationClass;
import creational.model.singletondesignpattern.SomeOtherSingletonClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Working with Rice
        ProductRice riceProduct = new ProductRice();
        riceProduct.getInfoAboutItemSourcedFrom(); // Sourced From Punjab
        System.out.println();
        riceProduct.getItemPricePerKg(); // Rs 100/Kg
        System.out.println();
        riceProduct.getItemPricePerTon(); // Rs 100000/Ton
        System.out.println();

        Rice rice = riceProduct.getProduct(Rice.class);
        System.out.println("Rice Type: " + rice.getRiceType()); // Winter Seasonal Rice

        System.out.println("\n-----------------------------");

        // Working with Sugarcane
        ProductSugarCane sugarcaneProduct = new ProductSugarCane();
        sugarcaneProduct.getInfoAboutItemSourcedFrom(); // Sugarcane sourced from Karnataka
        System.out.println();
        sugarcaneProduct.getItemPricePerKg(); // Rs. 50/Kg
        System.out.println();
        sugarcaneProduct.getItemPricePerTon(); // Rs. 50000/Ton
        System.out.println();

        Sugarcane sugarcane = sugarcaneProduct.getProduct(Sugarcane.class);
        System.out.println("Sugarcane Type: " + sugarcane.getCropType()); // SugarCane





        Crop riceProduct2 = new ProductRice(); // Interface reference
        riceProduct2.getInfoAboutItemSourcedFrom();
        riceProduct2.getItemPricePerKg();
        riceProduct2.getItemPricePerTon();

        // To get the specific product (Rice)
        Rice rice2 = ((ProductRice) riceProduct2).getProduct(Rice.class);
        System.out.println("Rice Type: " + rice2.getRiceType());


        EntityCrop riceEntity = new ProductRice();  //Using Abstract Class as Reference

        if (riceEntity instanceof Crop) {
            Crop riceBehavior = (Crop) riceEntity;
            riceBehavior.getInfoAboutItemSourcedFrom();  // ✅ Available
            riceBehavior.getItemPricePerKg();
            riceBehavior.getItemPricePerTon();
        }

        Rice rice3 = riceEntity.getProduct(Rice.class);
        System.out.println("Rice Type: " + rice3.getRiceType());

        /***Singleton class **/

        DummyApplicationClass anInstance = DummyApplicationClass.getInstanceOfTheClass();
        anInstance.someUsefulMethod();
        System.out.println("Getting other class instance "+anInstance.someMethod());
        SomeOtherSingletonClass someInstance = SomeOtherSingletonClass.getSomeOtherSingletonInstance();
        //someInstance.someInfo();
        System.out.print("Here we go again...");
        //anInstance.someMethod().someInfo();
        SomeService someServiceSingleton = SomeServiceSingleton.getSomeServiceInstance();
        System.out.print("Some Service Singleton...");
        someServiceSingleton.someInfo();


        //concrete class
        SubclassRice subclassRice = new SubclassRice();
        System.out.print("SubclassRice "+subclassRice.clone());
        subclassRice.showFullDetails();

    }
}