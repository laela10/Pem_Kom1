/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author Lenovo
 */
public class MallardDuck {
    
    public MallardDuck(FlyWithWings flyBehavior, Quack quackBehavior){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    MallardDuck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }

    void performQuack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}