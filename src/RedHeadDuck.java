public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        swimBehavior = new Swim();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

