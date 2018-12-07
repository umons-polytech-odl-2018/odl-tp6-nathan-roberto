import java.util.ArrayList;


public class Pizza implements nourriture {
    protected float price;
    protected String name;
    protected ArrayList<Ingrédient> Recette = new ArrayList<>();

    public Pizza(String name){
        this.name = name;
        Recette = new ArrayList<>();
    }

    public void addIngrédient(Ingrédient ingrédient){
        Recette.add(ingrédient);
    }


    @Override
    public float getPrice(){
        float price = 0;
        for (Ingrédient key : Recette) {
            price += key.getPrice();
        }
        return price;
    }

    @Override
    public String getName(){return name;}

}
