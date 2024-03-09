
public class Main {
    public static void main(String[] args) {

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        RubberDuck rb = new RubberDuck();
        rb.display();
        rb.performFly();
        rb.performQuack();

        MallardDuck md = new MallardDuck();
        md.display();
        md.performFly();
        md.performQuack();
    }
}
