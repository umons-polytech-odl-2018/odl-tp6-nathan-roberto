public class PizzaHut implements Pizzeria{
        static PizzaHut Singleton;
        private State state;

        private PizzaHut(){
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
        public PizzaHut createPizzeria(){
            if (Singleton == null){
                new PizzaHut();
            }
            return Singleton;
        }
}

