package practice.oop;

/**
 *
 * @author Lenovo
 */
public class ModelDuck {
    
    public ModelDuck(practice.oop.FlyNoWay flyBehavior, practice.oop.Quack quackBehavior){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    ModelDuck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void display(){
        System.out.println("I'm a model duck");
    }

    void performFly() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setFlyBehavior(DuckSimulator.FlyRocketpowered flyRocketpowered) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
