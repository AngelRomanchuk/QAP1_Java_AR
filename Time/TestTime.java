package Time;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display initial times
        System.out.println("Initial Time t1: " + t1.toString());
        System.out.println("Initial Time t2: " + t2.toString());

        // Call nextSecond() for t1
        Time nextT1 = t1.nextSecond();
        
        // Call previousSecond() for t2
        Time previousT2 = t2.previousSecond();

        // Display final times
        System.out.println("Final Time t1 after nextSecond: " + nextT1.toString());
        System.out.println("Final Time t2 after previousSecond: " + previousT2.toString());
    }
}

