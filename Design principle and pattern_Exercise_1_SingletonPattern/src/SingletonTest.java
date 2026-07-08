public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        Logger logger2 = Logger.getInstance();
        logger2.log("Loading Files");

        Logger logger3 = Logger.getInstance();
        logger3.log("Application Ended");

        System.out.println();

        System.out.println("Logger1 HashCode: " + logger1.hashCode());
        System.out.println("Logger2 HashCode: " + logger2.hashCode());
        System.out.println("Logger3 HashCode: " + logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("Only one Logger instance exists (Singleton).");
        } else {
            System.out.println("Multiple instances exist.");
        }
    }
}