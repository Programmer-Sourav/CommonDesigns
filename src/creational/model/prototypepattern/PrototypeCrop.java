package creational.model.prototypepattern;

import creational.model.SubClassRice;

public abstract class PrototypeCrop implements Cloneable {

    public PrototypeCrop(){

    }

    public <T> T getCrop(Class<T> type) throws ClassCastException{
        return (T) type;
    }

    public abstract <T> T clone(Class<T> type) ;
}


///subclass will copy/clone these and produce a resulting object with their own values.
/*
 *  class Rice(){String name, String supplier}
 *  class SugarCane(){String name, String supplier}
 *  Rice rice = new Rice();
 *  rice.name;
 *  rice.supplier;
 *
 * In the subclass()
 * {
 * super() // class Rice(){String name, String supplier}
 * clone> ref1 = ref2
 *
 * }
 */