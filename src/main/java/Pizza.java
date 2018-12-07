import java.util.ArrayList;


public class Pizza implements nourriture {
    protected float price;
    protected String name;
    //protected ArrayList<Ingrédient> Recette;
    ArrayList<Ingrédient> Recette = new ArrayList<Ingrédient>();
    @Override
    public float getPrice(){return price;}

    public void addIngrédient(Ingrédient ingrédient){
        Recette.add(ingrédient);
    }

}
