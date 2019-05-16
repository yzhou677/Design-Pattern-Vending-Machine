// strategy pattern
package strategyPattern;

import java.util.ArrayList;

public class DisposeAdditive1 extends DisposeAdditive {
    @Override
    public void DisposeAdditive(ArrayList a) {
        if (!a.isEmpty()) {
            System.out.println("  Adding sugar");
        }
    }
}
