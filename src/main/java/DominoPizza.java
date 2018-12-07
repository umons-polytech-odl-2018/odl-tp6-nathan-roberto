public class DominoPizza implements Pizzeria{
    static DominoPizza Singleton;
    private State state;


    private DominoPizza(){
        Singleton = this;
        this.state = new EnService(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    @Override
    public DominoPizza createPizzeria(){
        if (Singleton == null){
            new DominoPizza();
        }
        return Singleton;
    }
}
