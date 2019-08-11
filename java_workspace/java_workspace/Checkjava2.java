public class Checkjava2 {

    public static void main(String[] args) {
        System.out.println( "Java Version: " + System.getProperty("java.version"));
        System.out.println( "Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java home " + System.getProperty("java.home"));
        System.out.println("Java Vendor " + System.getProperty("java.vendor"));
        System.out.println("Java Class Path " + System.getProperty("java.class.path"));
    }
} 

