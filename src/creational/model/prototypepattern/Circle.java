package creational.model.prototypepattern;

public class Circle  implements  Cloneable{

    int radius;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
