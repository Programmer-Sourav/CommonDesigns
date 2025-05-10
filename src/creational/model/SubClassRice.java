package creational.model;

import creational.model.prototypepattern.PrototypeCrop;

public class SubClassRice extends PrototypeCrop {

    public SubClassRice(){
        super();
    }

    public SubClassRice(String  riceSourcedFrom, String riceSeason){
        super();
        this.riceSeason = riceSeason;
        this.riceSourcedFrom = riceSourcedFrom;
    }
    @Override
    public <T> T getCrop(Class<T> type) throws ClassCastException {
        return super.getCrop(type);
    }

    @Override
    public <T> T clone(Class<T> type) throws ClassCastException {
        //return super.clone(type);
        //It will take the rice class
        //but SubClassRice will implement it

    }

    private String riceSourcedFrom;
    private String riceSeason;
}
