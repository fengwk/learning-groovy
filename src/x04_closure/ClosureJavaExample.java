package x04_closure;

import java.util.function.Consumer;

/**
 * @author fengwk
 */
public class ClosureJavaExample {

    public static void main(String[] args) {
//        Consumer<String> closure = (String name) -> System.out.println("hello, " + name);
        Consumer<String> closure = name -> System.out.println("hello, " + name);
        closure.accept("fengwk");
    }

}
