package creational.model.singletondesignpattern;

public class DummyApplicationClass {

    /**PRIVATE static variable ***/

    private static DummyApplicationClass privateInstance;

    /**Private Constructor **/
    private DummyApplicationClass(){

    }

    /** PUBLIC static creation method **/

    public static DummyApplicationClass getInstanceOfTheClass(){
        if(privateInstance==null) {
            privateInstance = new DummyApplicationClass();
        }
        return privateInstance;
    }

    public void someUsefulMethod(){
        System.out.print("Did you know 2 + 3 makes 5 ?");
    }

    public SomeOtherSingletonClass someMethod(){
        return SomeOtherSingletonClass.getSomeOtherSingletonInstance();
    }


}
