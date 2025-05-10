package creational.model;

public class SomeServiceSingleton {
    private static SomeService someServiceInstance;

    private SomeServiceSingleton(){

    }



    public static SomeService getSomeServiceInstance(){
        if(someServiceInstance==null){
            someServiceInstance = new SomeService();
        }
        return someServiceInstance;
    }
}
