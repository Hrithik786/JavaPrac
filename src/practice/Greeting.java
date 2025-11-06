package practice;

// it is also a functional interface because it has only one abstract method (SAM)
// public interface Greeting {
//     void greet();
// }


//best practice to annotate with @FunctionalInterface cause 
// if more than one abstract method is present it'll gives compile time error
@FunctionalInterface
public interface Greeting {
    void greet();
}