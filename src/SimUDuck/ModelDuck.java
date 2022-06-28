package SimUDuck;

import SimUDuck.FlyBehaviour.FlyNoWay;
import SimUDuck.QuackBehaviour.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Model Duck");
    }
}
