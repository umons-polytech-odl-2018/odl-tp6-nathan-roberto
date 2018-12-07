public class DominoPizza implements Pizzeria{
    static DominoPizza Singleton;

    private DominoPizza(){
        Singleton = this;
    }

    public DominoPizza getDominoPizza(){
        if (Singleton == null){
            new DominoPizza();
        }
        return Singleton;
    }
}
