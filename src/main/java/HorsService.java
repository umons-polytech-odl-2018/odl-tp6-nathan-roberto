public class HorsService extends State {
    HorsService(Pizzeria pizzeria){
        super(pizzeria);
    }

    @Override
    public String createNewPizza() {
        return "Plus d'ingrédients disponibles";
    }
}
