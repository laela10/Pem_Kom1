package practice.oop;

/**
 *
 * @author Lenovo
 */
public class RubberDuck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public RubberDuck(FlyNoWay flyBehavior){
        flyBehavior = new FlyNoWay();
        //quackBehavior = new squeak();
        quackBehavior = () -> System.out.println("Squeak");
    }
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    public void display(){
        System.out.println("Im a rubber duckie");
    }

    void performQuack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
