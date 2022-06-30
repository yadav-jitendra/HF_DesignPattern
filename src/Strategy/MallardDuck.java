package Strategy;

import Strategy.FlyBehaviour.FlyWithWings;
import Strategy.QuackBehaviour.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard Duck");
    }
}
