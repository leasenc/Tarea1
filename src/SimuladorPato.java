public class SimuladorPato {
    public static void main(String[] args) {

        ToyStoryDuck ToyStory = new ToyStoryDuck();
        FlyBehavior cantFly = () -> System.out.println("Vuelo con estilo");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck	rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck	decoy = new DecoyDuck();

        Duck	 model = new ModelDuck();

        ToyStory.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new VolandoAto());
        model.performFly();


    }
}
