public class ToyStoryDuck  extends Duck{
    public ToyStoryDuck() {
        quackBehavior = new Quack();
        flyBehavior = new VolandoAto();
    }

    public void display() {
        System.out.println("Soy un pato de película");
    }

}
