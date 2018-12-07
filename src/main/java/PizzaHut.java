public class PizzaHut implements Pizzeria{
        static PizzaHut Singleton;

        private PizzaHut(){
            Singleton = this;
        }

        public PizzaHut getPizzaHut(){
            if (Singleton == null){
                new PizzaHut();
            }
            return Singleton;
        }
}

