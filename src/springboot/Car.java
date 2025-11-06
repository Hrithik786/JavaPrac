package springboot;

// public class Car extends Engine{ // is-a relationship Car is inheriting Engine
    
//     public void drive() {
//         super.start(); // calling inherited method from Engine class
//         System.out.println("Car is driving");
//     }
// }
//in future, Car is not extendable anymore to other classes because java does not support multiple inheritance

public class Car {
    private Engine engine; // has-a relationship

    public Car() {
        this.engine = new Engine();
        //if i change the constructor of Engine class then my Car class is also going to be affected,
        // in this way car is going to be tightly coupled with Engine class
        // we always need to develop loosely coupled code
    }

    public void drive() {
        engine.start(); // calling method from Engine class
        System.out.println("Car is driving");
    }
}
/*
 * loosly couply means without creating object and without inherting properties
 *  we should able to access one class method's in other class
 * if we make changes in Car class then Engine class should not be affected
 * to develop classes in loosely coupled way we use concepts like interfaces,
 * 
 * DI: Dependency Injection, injecting  the object of one class to other class
 * it is a design pattern used to implement IoC (Inversion of Control)
 * there are 3 types of DI
 * 1. Constructor Injection
 * 2. Setter Injection
 * 3. Field Injection
 * 
 * Reflection API: it is used to access private members of a class
 */