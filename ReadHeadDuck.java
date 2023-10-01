package practice.oop;

/**
 *
 * @author Lenovo
 */
public class ReadHeadDuck {
    
    public ReadHeadDuck(FlyWithWings flyBehavior, Quack quackBehavior){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm real Red Headed duck");
    }
}
