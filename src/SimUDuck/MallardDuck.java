package SimUDuck;

import SimUDuck.FlyBehaviour.FlyWithWings;
import SimUDuck.QuackBehaviour.Quack;

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
