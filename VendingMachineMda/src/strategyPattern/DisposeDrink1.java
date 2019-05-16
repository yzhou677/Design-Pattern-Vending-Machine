// strategy pattern
package strategyPattern;

public class DisposeDrink1 extends DisposeDrink {
    @Override
    public void DisposeDrink(int d) {
        if (d == 1) {
            System.out.println("  Dispose tea");
        } else if (d == 2) {
            System.out.println("  Dispose chocolate");
        }

    }
}
