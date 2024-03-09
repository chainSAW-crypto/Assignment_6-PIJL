
public interface QuackBehavior {
    public void quack();
}

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("Flying with wings!");
    }
}
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("Cannot Fly ..... Cry Bitch!");
    }
}
public class Swim implements SwimBehavior {
    public void swim() {
        System.out.println("Swimming.");
    }
}
public class Swim implements SwimBehavior {
    public void swim() {
        System.out.println("Swimming.");
    }
}
public class Float implements SwimBehavior {
    public void swim() {
        System.out.println("Floating on water.");
    }
}
public class Drown implements SwimBehavior {
    public void swim() {
        System.out.println("I'm drowning!");
    }
}
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.print("Duck Only Squeaks!!!");
    }
}
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.print("Quack ... Quack Nigga!!!");
    }
}
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
