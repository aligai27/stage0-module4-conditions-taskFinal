package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider != 0) {
            int res = dividend / divider;
            System.out.println(dividend == divider * res ? "can be divided completely" : "cannot be divided completely");
        } else {
            System.out.println("division by zero");
        }
    }
}
