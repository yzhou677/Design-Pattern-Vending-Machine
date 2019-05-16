// strategy pattern
package strategyPattern;

public class DisposeDrink2 extends DisposeDrink {
    @Override
    public void DisposeDrink(int d) {
        if (d == 1) {
            System.out.println("  Dispose coffee");
        }

    }
}
