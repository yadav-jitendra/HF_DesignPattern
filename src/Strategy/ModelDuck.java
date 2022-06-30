package Strategy;

import Strategy.FlyBehaviour.FlyNoWay;
import Strategy.QuackBehaviour.Quack;

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
