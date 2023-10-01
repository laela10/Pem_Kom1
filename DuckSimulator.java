/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bebek yang ingin Anda lihat:");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Rubber Duck");
        System.out.println("3. Decoy Duck");
        System.out.println("4. Model Duck");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performMallardDuck();
                break;
            case 2:
                performRubberDuck();
                break;
            case 3:
                performDecoyDuck();
                break;
            case 4:
                performModelDuck();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }

    public static void performMallardDuck() {
        MallardDuck mallard = new MallardDuck();
        mallard.performQuack();
    }

    public static void performRubberDuck() {
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        rubberDuckie.performQuack();
    }

    public static void performDecoyDuck() {
        DecoyDuck decoy = new DecoyDuck();
        decoy.performQuack();
    }

    public static void performModelDuck() {
        ModelDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketpowered());
        model.performFly();
    }

    private static class FlyRocketpowered {

        private FlyRocketpowered() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}