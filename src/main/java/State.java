public abstract class State {
    Pizzeria pizzeria;

    State(Pizzeria pizzeria){
        this.pizzeria = pizzeria;
    }

    public abstract int test();
}
