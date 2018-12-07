import java.util.ArrayList;


public class Pizza implements nourriture {
    private float price;
    private String name;
    private ArrayList<Ingrédient> Recette;

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

    @Override
    public String toString(){
        return ("Nom Pizza :" + name + "\n Prix:" + price);
    }

}
