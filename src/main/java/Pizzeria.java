public abstract class Pizzeria {
    public static Pizzeria getPizzeria(String Name){
        switch(Name) {
            case "Hut":
                return PizzaHut.createPizzeria();
            case "Domino":
                return DominoPizza.createPizzeria();
                default:
                    return null;
        }
    }

    public abstract Pizzeria createPizzeria(String name);
}
