package creational.model.singletondesignpattern;

public class SomeOtherSingletonClass {

    private static SomeOtherSingletonClass someOtherInstance;
    private SomeOtherSingletonClass(){

    }

    public static SomeOtherSingletonClass getSomeOtherSingletonInstance(){
        if(someOtherInstance==null)
        {
            someOtherInstance = new SomeOtherSingletonClass();
        }
        return someOtherInstance;
    }


}
