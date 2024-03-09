public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }
    @Override
    public void display() {
        System.out.println("This is Rubber Duck .... Nigga!!!!");

    }
}
