package SimUDuck.QuackBehaviour;

import SimUDuck.QuackBehaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
